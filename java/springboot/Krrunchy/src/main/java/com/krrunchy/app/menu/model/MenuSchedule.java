package com.krrunchy.app.menu.model;

import java.text.MessageFormat;
import java.util.List;

public class MenuSchedule {
	private String date;
	private List<String> items;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return MessageFormat.format("{0},{1}", date , items);
	}
}
