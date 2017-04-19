package com.eryuzhisen.model.report;

import java.io.Serializable;
import java.util.Date;

public class UserFeedback implements Serializable{

	/**  */
	private static final long serialVersionUID = -5960082729460707798L;
	
	private int feedbackId;
	private long userId;
	private String contactInfo;
	private String content;
	private String imgUrl;
	private short feedbackStatus;
	private String feedbackRemark;
	private Date createTime;
	private Date updateTime;
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
    public short getFeedbackStatus() {
        return feedbackStatus;
    }
    public void setFeedbackStatus(short feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getFeedbackRemark() {
        return feedbackRemark;
    }
    public void setFeedbackRemark(String feedbackRemark) {
        this.feedbackRemark = feedbackRemark;
    }
    public int getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

}
