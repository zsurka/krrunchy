package com.krrunchy.app.menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krrunchy.app.menu.model.MenuDate;

@Controller
@RequestMapping("/menus")
public class MenuController {
	private static final String DD_MM_YYYY = "dd/MM/yyyy";
	private MenuRepository repo;
	
	@Autowired
	public MenuController(MenuRepository repo) {
		this.repo = repo;
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<MenuDate> findAllMenus(){
		List<MenuDate> findAll = repo.findAll();
		return findAll;	
	}

	@RequestMapping(method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	private List<MenuDate> getMenusFor(@RequestParam("date") String date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DD_MM_YYYY);
		try {
			//Expected date example -"21/7/2018"`
			MenuDate menuDate = repo.findForDate(formatter.parse(date));
			ArrayList<MenuDate> list = new ArrayList<MenuDate>();
			list.add(menuDate);
			return list;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
