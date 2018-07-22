package com.krrunchy.app.menu;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.krrunchy.app.menu.model.MenuDate;

@Repository
public class MenuRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<MenuDate> findAll() {
		String query = "select * from menu_schedule ";
		List<MenuDate> query2 = jdbcTemplate.query(query,new MenuRowMapper());
		return query2 ;
	}
	
	public MenuDate findForDate(java.util.Date date) {
		Date sqlDate = new Date(date.getTime());
		String query = "select * from menu_schedule where delivery_date=?";
		List<MenuDate> query2 = jdbcTemplate.query(query,new Object[]{sqlDate},new MenuRowMapper());
		return query2.get(0) ;
	}
	
	class MenuRowMapper implements RowMapper<MenuDate>{
		@Override
		public MenuDate mapRow(ResultSet rs, int rowNum) throws SQLException {
			MenuDate md = new MenuDate();
			md.setDate(rs.getString("delivery_date"));
			md.setMenuId(rs.getInt("menu_id"));
			return md;
		}
		
	}
}
