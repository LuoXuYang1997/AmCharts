package com.scce.pojo;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-07 11:06
 **/
//封装条形图所需信息
public class Roomchart {

    //房间类型
    private String roomtypestr;

    //房间数量
    private Integer roomNum;

    //可入住房间数量
    private Integer InRoomNum;

    public String getRoomtypestr() {
        return roomtypestr;
    }

    public void setRoomtypestr(String roomtypestr) {
        this.roomtypestr = roomtypestr;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getInRoomNum() {
        return InRoomNum;
    }

    public void setInRoomNum(Integer inRoomNum) {
        InRoomNum = inRoomNum;
    }

    @Override
    public String toString() {
        return "Roomchart{" +
                "roomtypestr='" + roomtypestr + '\'' +
                ", roomNum=" + roomNum +
                ", InRoomNum=" + InRoomNum +
                '}';
    }
}

