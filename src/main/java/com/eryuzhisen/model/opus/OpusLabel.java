package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class OpusLabel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6751335065919130210L;
	
	private int id;
	private int categoryId;
	private String labelTxt;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabelTxt() {
		return labelTxt;
	}
	public void setLabelTxt(String labelTxt) {
		this.labelTxt = labelTxt;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
