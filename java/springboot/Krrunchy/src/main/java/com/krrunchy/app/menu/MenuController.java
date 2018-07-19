package com.krrunchy.app.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krrunchy.app.menu.model.Menu;

@Controller
@RequestMapping("/menus")
public class MenuController {
	private MenuRepository repo;
	
	@Autowired
	public MenuController(MenuRepository repo) {
		this.repo = repo;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Menu> findAllMenus(){
		return null; //TODO: to be implemented
	}
}
