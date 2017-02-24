package com.eryuzhisen.model.report;

import java.io.Serializable;
import java.util.Date;

public class UserReport implements Serializable{

	/**  */
	private static final long serialVersionUID = -6390997084020241606L;
	
	private int id;
	private long userId;
	/*举报内容id*/
	private int contentId;
	/*举报内容类型*/
	private short contentType;
	private short reportType;
	/*其他原因内容*/
	private String reportReason;
	private short reportStatus;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public short getContentType() {
		return contentType;
	}
	public void setContentType(short contentType) {
		this.contentType = contentType;
	}
	public short getReportType() {
		return reportType;
	}
	public void setReportType(short reportType) {
		this.reportType = reportType;
	}
	public String getReportReason() {
		return reportReason;
	}
	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
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
	public short getReportStatus() {
		return reportStatus;
	}
	public void setReportStatus(short reportStatus) {
		this.reportStatus = reportStatus;
	}
	
}
