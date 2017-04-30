package com.eryuzhisen.model.opus;

import java.io.Serializable;

public class UserCommentCount implements Serializable{

    /**  */
    private static final long serialVersionUID = -5341936516639987104L;

    private long userId;
    private int commentCount;
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    
}
