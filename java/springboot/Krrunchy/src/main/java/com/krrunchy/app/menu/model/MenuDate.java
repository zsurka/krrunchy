package com.krrunchy.app.menu.model;

import java.text.MessageFormat;

public class MenuDate {
	private String date;
	private int menuId;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("{0},{1}", menuId, date);
	}
}
