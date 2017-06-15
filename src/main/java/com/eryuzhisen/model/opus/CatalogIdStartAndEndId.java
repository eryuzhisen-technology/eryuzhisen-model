package com.eryuzhisen.model.opus;

import java.io.Serializable;

public class CatalogIdStartAndEndId implements Serializable {

    /**  */
    private static final long serialVersionUID = -2985718661877107243L;
    
    private int startId;
    private int endId;
    public int getStartId() {
        return startId;
    }
    public void setStartId(int startId) {
        this.startId = startId;
    }
    public int getEndId() {
        return endId;
    }
    public void setEndId(int endId) {
        this.endId = endId;
    }
    

}
