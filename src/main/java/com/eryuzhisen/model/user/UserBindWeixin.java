package com.eryuzhisen.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserBindWeixin implements Serializable{

    /**  */
    private static final long serialVersionUID = -8966891792935934217L;
    
    private long userId;
    private long id;
    private String openId;
    private String unionId;
    
    private Date createTime;
    private Date updateTime;
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getUnionId() {
        return unionId;
    }
    public void setUnionId(String unionId) {
        this.unionId = unionId;
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
