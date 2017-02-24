package com.eryuzhisen.model.config;

import java.io.Serializable;
import java.util.Date;

public class UserNoticeSetting implements Serializable{

	/**  */
	private static final long serialVersionUID = 8785575033290029130L;
	
	private long id;
	private long userId;
	private short opusUpdate;
	private short recommended;
	private short comment;
	private short remindMode;
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
	public short getOpusUpdate() {
		return opusUpdate;
	}
	public void setOpusUpdate(short opusUpdate) {
		this.opusUpdate = opusUpdate;
	}
	public short getRecommended() {
		return recommended;
	}
	public void setRecommended(short recommended) {
		this.recommended = recommended;
	}
	public short getComment() {
		return comment;
	}
	public void setComment(short comment) {
		this.comment = comment;
	}
	public short getRemindMode() {
		return remindMode;
	}
	public void setRemindMode(short remindMode) {
		this.remindMode = remindMode;
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
