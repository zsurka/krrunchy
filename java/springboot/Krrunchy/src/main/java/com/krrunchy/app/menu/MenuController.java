package com.krrunchy.app.menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krrunchy.app.menu.model.MenuSchedule;

@Controller
@RequestMapping("/menus")
@CrossOrigin
public class MenuController {
	private MenuRepository repo;
	
	@Autowired
	public MenuController(MenuRepository repo) {
		this.repo = repo;
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<MenuSchedule> findAllMenus(){
		List<MenuSchedule> findAll = repo.findAll();
		return findAll;	
	}

	@RequestMapping(method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	private List<MenuSchedule> getMenusFor(@RequestParam("date") String dateString) {
		SimpleDateFormat formatter = new SimpleDateFormat(Constants.DEFAULT_DATE_FORMAT);
		try {
			//Expected date example -"21/7/2018"
			MenuSchedule menuDate = repo.findForDate(formatter.parse(dateString));
			ArrayList<MenuSchedule> list = new ArrayList<MenuSchedule>();
			list.add(menuDate);
			return list;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
