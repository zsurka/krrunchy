package com.krrunchy.app.menu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.krrunchy.app.menu.model.MenuSchedule;

@Repository
public class MenuRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<MenuSchedule> findAll() {
		String query = "select  delivery_date from menu_schedule";
		List<Date> dates = jdbcTemplate.query(query,new DateMapper());
		
		//TODO: write stream
		//TODO: move this to stored procedures in the DB
		List<MenuSchedule> menuSchedules = new LinkedList<MenuSchedule>();
		for (Date date2 : dates) {
			menuSchedules.add(findForDate(date2));
		}
		
		return menuSchedules ;
	}
	
	public MenuSchedule findForDate(Date date) {
		Date sqlDate = new Date(date.getTime());
		String query = "select menu_item_name from menu_item where menu_item_id in (\r\n" + 
				"	select menu_item_id from menu_details where menu_id in(\r\n" + 
				"		select menu_id from menu_schedule where delivery_date=?\r\n" + 
				"	)\r\n" + 
				")";
		List<String> items = jdbcTemplate.query(query,new Object[]{sqlDate},new MenuRowMapper());
		
		SimpleDateFormat formatter = new SimpleDateFormat(Constants.DEFAULT_DATE_FORMAT);
		MenuSchedule schedule = new MenuSchedule();
		schedule.setDate(formatter.format(date));
		schedule.setItems(items);
		
		return schedule ;
	}
	
	class DateMapper implements RowMapper<Date>{
		@Override
		public Date mapRow(ResultSet rs, int rowNum) throws SQLException {
			SimpleDateFormat formatter = new SimpleDateFormat(Constants.DB_DATE_FORMAT);
			String dateString = rs.getString("delivery_date");
			Date date = null;
			try {
				date = formatter.parse(dateString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return date;
		}
	}
	
	class MenuRowMapper implements RowMapper<String>{
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			return rs.getString("menu_item_name");
		}
	}
}
