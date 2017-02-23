package com.eryuzhisen.model.attach;

import java.util.Map;

public class Jumpui implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -631349469101777567L;

	private String page_id;
	private Map<String,String> arguments;
	
	public String getPage_id() {
		return page_id;
	}
	public void setPage_id(String page_id) {
		this.page_id = page_id;
	}
	
	public Map<String, String> getArguments() {
		return arguments;
	}
	public void setArguments(Map<String, String> arguments) {
		this.arguments = arguments;
	}
	public Jumpui() {
		// TODO Auto-generated constructor stub
	}
	public Jumpui(String page_id, Map<String,String> arguments) {
		this.page_id = page_id;
		this.arguments = arguments;
	}
	public Jumpui(String page_id) {
		this.page_id = page_id;
	}
	
}
