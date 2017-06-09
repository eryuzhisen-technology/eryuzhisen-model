package com.eryuzhisen.model.opus;

import java.io.Serializable;
import java.util.Date;

public class UserOpusWatchHistory implements Serializable{

	/**  */
	private static final long serialVersionUID = -5668139625909240434L;

	private long id;
	private long userId;
	private int catalogId;
	private int chapterId;
	private int times;
	private Date createTime;
	private Date updateTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
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
    public int getTimes() {
        return times;
    }
    public void setTimes(int times) {
        this.times = times;
    }
	
}
