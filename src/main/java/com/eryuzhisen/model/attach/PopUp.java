package com.eryuzhisen.model.attach;

import java.util.List;

public class PopUp implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4079206452755603880L;

	private String popup_ret;//标识0-成功 1-失败
	private String popup_type;
	private String img;
	private String title;
	private String text;
	private List<Popup_Button> buttons;
	
	public String getPopup_ret() {
		return popup_ret;
	}
	public void setPopup_ret(String popup_ret) {
		this.popup_ret = popup_ret;
	}
	public String getPopup_type() {
		return popup_type;
	}
	public void setPopup_type(String popup_type) {
		this.popup_type = popup_type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Popup_Button> getButton() {
		return buttons;
	}
	public void setButton(List<Popup_Button> buttons) {
		this.buttons = buttons;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
