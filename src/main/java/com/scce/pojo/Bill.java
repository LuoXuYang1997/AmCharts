package com.scce.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-05-30 20:34
 **/
public class Bill implements Serializable {
    private Integer id;         //用户ID
    private String roomNumber; //房间号
    private Integer roomType;  //房间类型
    private String guestName; //顾客姓名
    private String idCard;     //身份证
    private Date generationTime;//生成时间
    private String phone;        //电话
    private Float payAmount;    //实付金额
    private String checkintime; //入住时间
    private String checkouttime; //退房时间
    private Integer billstatus;  //订单状态
    private String billstatusstr;//订单状态str
    private String roomtypestr;   //房间类型str


    //封装房间信息
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(Date generationTime) {
        this.generationTime = generationTime;
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public String getRoomtypestr() {
        return roomtypestr;
    }

    public void setRoomtypestr(String roomtypestr) {
        this.roomtypestr = roomtypestr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillstatusstr() {
        if (billstatus == 0) {
            billstatusstr = "结账";
        } else if (billstatus == 1) {
            billstatusstr = "未结账";
        }
        return billstatusstr;
    }

    public void setBillstatusstr(String billstatusstr) {
        this.billstatusstr = billstatusstr;
    }


    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType=" + roomType +
                ", guestName='" + guestName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", generationTime=" + generationTime +
                ", phone='" + phone + '\'' +
                ", payAmount=" + payAmount +
                ", checkintime='" + checkintime + '\'' +
                ", checkouttime='" + checkouttime + '\'' +
                ", billstatus=" + billstatus +
                ", billstatusstr='" + billstatusstr + '\'' +
                ", roomtypestr='" + roomtypestr + '\'' +
                ", room=" + room +
                '}';
    }
}
