package com.dm.datamanagement.dataManagement.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    private Integer mid;
    private String mname;
    private String tech;
    private boolean incart;
    private String path;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public boolean isIncart() {
        return incart;
    }

    public void setIncart(boolean incart) {
        this.incart = incart;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /*public Member(Integer mid, String mname, String tech, boolean incart, String path) {
        this.mid = mid;
        this.mname = mname;
        this.tech = tech;
        this.incart = incart;
        this.path = path;
    }*/
    public Member () {}

}
