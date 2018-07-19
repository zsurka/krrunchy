package com.krrunchy.app.menu;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.krrunchy.app.menu.model.Menu;

@Repository
public class MenuRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Menu> findAll() {
		return null;
	}
	
	public Menu findForDate(Date date) {
		return null;
	}
}
