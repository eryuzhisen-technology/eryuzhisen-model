package com.eryuzhisen.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserJpushLog implements Serializable {
	/**  */
	private static final long serialVersionUID = 5154939787074909381L;
	private int id;
	private String msgId;
	private long userId;
	private String sendNo;
	private String jpushData;
	private Date createTime;
	private short jpushType;
	private String attach;
	private String mediaUrl;
	private short messageType;
	private short available;
	private Date updateTime;
	private short read;
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

	public String getJpushData() {
		return jpushData;
	}

	public void setJpushData(String jpushData) {
		this.jpushData = jpushData;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public short getJpushType() {
		return jpushType;
	}

	public void setJpushType(short jpushType) {
		this.jpushType = jpushType;
	}

	public String getSendNo() {
		return sendNo;
	}

	public void setSendNo(String sendNo) {
		this.sendNo = sendNo;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

    public short getMessageType() {
        return messageType;
    }

    public void setMessageType(short messageType) {
        this.messageType = messageType;
    }

    public short getAvailable() {
        return available;
    }

    public void setAvailable(short available) {
        this.available = available;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public short getRead() {
        return read;
    }

    public void setRead(short read) {
        this.read = read;
    }
    
}
