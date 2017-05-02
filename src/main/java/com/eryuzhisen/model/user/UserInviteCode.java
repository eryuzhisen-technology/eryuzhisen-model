package com.eryuzhisen.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserInviteCode implements Serializable{

    /**  */
    private static final long serialVersionUID = -8821770418477717366L;
    
    private int id;
    private Long userId;
    private Long invitedUserId;
    private String inviteCode;
    private short inviteStatus;
    private Date createTime;
    private Date updateTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getInviteCode() {
        return inviteCode;
    }
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
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
    public Long getInvitedUserId() {
        return invitedUserId;
    }
    public void setInvitedUserId(Long invitedUserId) {
        this.invitedUserId = invitedUserId;
    }
    public short getInviteStatus() {
        return inviteStatus;
    }
    public void setInviteStatus(short inviteStatus) {
        this.inviteStatus = inviteStatus;
    }
    
}
