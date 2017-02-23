package com.eryuzhisen.model.attach;

public class Animation implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2855097686834916179L;

	private String text;
	private String thumbnails_url;
	private String resource_url;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getThumbnails_url() {
		return thumbnails_url;
	}
	public void setThumbnails_url(String thumbnails_url) {
		this.thumbnails_url = thumbnails_url;
	}
	public String getResource_url() {
		return resource_url;
	}
	public void setResource_url(String resource_url) {
		this.resource_url = resource_url;
	}
	public Animation(String text, String thumbnails_url,
			String resource_url) {
		this.text = text;
		this.thumbnails_url = thumbnails_url;
		this.resource_url = resource_url;
	}
	public Animation() {
		// TODO Auto-generated constructor stub
	}
	
}
