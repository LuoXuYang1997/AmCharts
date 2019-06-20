package com.scce.pojo;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-07 12:13
 **/
//封装饼状图所需信息
public class Roomchartwithbill {
    //房间类型
    private String roomtype;
    //订单数量
    private Integer billnumber;

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getBillnumber() {
        return billnumber;
    }

    public void setBillnumber(Integer billnumber) {
        this.billnumber = billnumber;
    }

    @Override
    public String toString() {
        return "Roomchartwithbill{" +
                "roomtype='" + roomtype + '\'' +
                ", billnumber=" + billnumber +
                '}';
    }
}
