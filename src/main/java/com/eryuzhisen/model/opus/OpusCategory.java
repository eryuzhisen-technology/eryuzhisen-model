package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class OpusCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6289856847385026660L;
	
	private int id;
	private int parentId;
	private String categoryTitle;
	private String categoryDesc;
	private String categoryCoverUrl;
	private short available;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public String getCategoryCoverUrl() {
		return categoryCoverUrl;
	}
	public void setCategoryCoverUrl(String categoryCoverUrl) {
		this.categoryCoverUrl = categoryCoverUrl;
	}
	public short getAvailable() {
		return available;
	}
	public void setAvailable(short available) {
		this.available = available;
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
	
}
