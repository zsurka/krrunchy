package com.krrunchy.app.menu.model;

import java.text.MessageFormat;

public class MenuDate {
	private String date;
	private String items;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return MessageFormat.format("{0},{1}", items, date);
	}
}
