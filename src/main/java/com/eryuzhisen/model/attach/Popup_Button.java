package com.eryuzhisen.model.attach;

public class Popup_Button implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7303765269148513220L;
	private String text;
	private Jumpui jumpui;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Jumpui getJumpui() {
		return jumpui;
	}
	public void setJumpui(Jumpui jumpui) {
		this.jumpui = jumpui;
	}
	public Popup_Button(String text) {
		this.text = text;
	}

	public Popup_Button(String text, Jumpui jumpui) {
		this.text = text;
		this.jumpui = jumpui;
	}
	public Popup_Button() {
		// TODO Auto-generated constructor stub
	}
	
}
