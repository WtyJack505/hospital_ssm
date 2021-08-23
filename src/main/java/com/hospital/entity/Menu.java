package com.hospital.entity;

public class Menu {
    private Integer mId;

    private String mName;

    private Integer mParentId;

    private String mType;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmParentId() {
        return mParentId;
    }

    public void setmParentId(Integer mParentId) {
        this.mParentId = mParentId;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType == null ? null : mType.trim();
    }
}