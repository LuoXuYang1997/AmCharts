package com.scce.pojo;

public class RoomType {
    private int id;//自编号
    private int rid;//房间类型编号
    private String type;//房间类型

    public RoomType() {
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public RoomType(int id, int rid, String type) {
        this.id = id;
        this.rid = rid;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "id=" + id +
                ", rid=" + rid +
                ", type='" + type + '\'' +
                '}';
    }
}
