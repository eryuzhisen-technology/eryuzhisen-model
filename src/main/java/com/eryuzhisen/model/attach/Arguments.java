package com.eryuzhisen.model.attach;

public class Arguments implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1726834154465145889L;
	private String argvalue;
	private String argkey;

	public String getArgvalue() {
		return argvalue;
	}
	public void setArgvalue(String argvalue) {
		this.argvalue = argvalue;
	}
	public String getArgkey() {
		return argkey;
	}
	public void setArgkey(String argkey) {
		this.argkey = argkey;
	}

	public Arguments() {
		// TODO Auto-generated constructor stub
	}
	public Arguments(String argvalue, String argkey) {
		this.argvalue = argvalue;
		this.argkey = argkey;
	}
}
