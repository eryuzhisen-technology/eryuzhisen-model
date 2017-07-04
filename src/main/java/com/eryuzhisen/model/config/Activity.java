package com.eryuzhisen.model.config;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable{

    /**  */
    private static final long serialVersionUID = 4948368282045080799L;

    private int id;
    private String actTitle;
    private String actDesc;
    private String actImg;
    private String clientVersion;
    private short clientType;
    private String jump;
    private Date createTime;
    private Date updateTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getActTitle() {
        return actTitle;
    }
    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }
    public String getActDesc() {
        return actDesc;
    }
    public void setActDesc(String actDesc) {
        this.actDesc = actDesc;
    }
    public String getActImg() {
        return actImg;
    }
    public void setActImg(String actImg) {
        this.actImg = actImg;
    }
    public String getClientVersion() {
        return clientVersion;
    }
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    public short getClientType() {
        return clientType;
    }
    public void setClientType(short clientType) {
        this.clientType = clientType;
    }
    public String getJump() {
        return jump;
    }
    public void setJump(String jump) {
        this.jump = jump;
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
