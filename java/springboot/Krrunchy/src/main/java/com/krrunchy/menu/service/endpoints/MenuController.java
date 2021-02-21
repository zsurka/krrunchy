package com.krrunchy.menu.service.endpoints;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krrunchy.menu.service.model.Menu;
import com.krrunchy.menu.service.repository.MenuRepository;

@Controller
@RequestMapping("/menus")
@CrossOrigin
public class MenuController {
	@Autowired
	private MenuRepository repo;
	
	@Autowired
	public MenuController(MenuRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping(value="/",produces = "application/json")
	@ResponseBody
	public List<Menu> getAllMenus(){
		List<Menu> findAll = repo.getAllMenus();
		return findAll;	
	}

	@GetMapping(value="/{id}",produces = "application/json")
	@ResponseBody
	public Menu getMenuById(@RequestParam("id") long id){
		Menu findAll = repo.getMenuFor(id);
		return findAll;	
	}
	
	@PostMapping(value="/",produces = "application/json")
	@ResponseBody
	public Menu addMenu(){
		return new Menu();	
	}

	@DeleteMapping(value="/{id}",produces = "application/json")
	@ResponseBody
	public Menu deleteMenuById(){
		return new Menu();	
	}
}
