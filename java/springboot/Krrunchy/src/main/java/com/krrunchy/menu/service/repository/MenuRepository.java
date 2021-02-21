package com.krrunchy.menu.service.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.krrunchy.menu.service.model.Menu;

@Repository
public class MenuRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Menu> getAllMenus(){
		//TODO: implement this
		return Collections.emptyList();
	}
	
	public Menu getMenuFor(long id) {
		//TODO: implement this
		return new Menu();
	}
	
	
}
