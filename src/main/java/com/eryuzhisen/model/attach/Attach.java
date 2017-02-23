package com.eryuzhisen.model.attach;

public class Attach implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3000752131476871001L;
	private Jumpui jumpui;
	private PopUp popup;
	private Animation animation;
	
	public Jumpui getJumpui() {
		return jumpui;
	}
	public void setJumpui(Jumpui jumpui) {
		this.jumpui = jumpui;
	}
	public PopUp getPopup() {
		return popup;
	}
	public void setPopup(PopUp popup) {
		this.popup = popup;
	}
	
	public Animation getAnimation() {
		return animation;
	}
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
	public Attach() {
		// TODO Auto-generated constructor stub
	}
	public Attach(Jumpui jumpui, PopUp popup) {
		this.jumpui = jumpui;
		this.popup = popup;
	}
	public Attach(Jumpui jumpui, PopUp popup, Animation animation) {
		super();
		this.jumpui = jumpui;
		this.popup = popup;
		this.animation = animation;
	}
	public void setPopupText(String text) {
		if(this.popup != null)
			this.popup.setText(text);
	}
	public void setPopupTitle(String title) {
		if(this.popup != null)
			this.popup.setTitle(title);
	}
}
