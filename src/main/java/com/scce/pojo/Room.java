package com.scce.pojo;

public class Room {
    private String roomNumber;//房间号
    private float price;//价格
    private int roomType;//房间类型
    private float deposit;//押金
    private int status;//客房状态
    private String statusstr;//客房状态的汉字描述
    private RoomType roomTypestr;//封装房间类型
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public RoomType getRoomTypestr() {
        return roomTypestr;
    }

    public void setRoomTypestr(RoomType roomTypestr) {
        this.roomTypestr = roomTypestr;
    }

    public String getStatusstr() {//1:可入住，2：已入住，3：待清理，4：停用
        if(status==1){
            statusstr="可入住";
        }else if(status==2){
            statusstr="已入住";
        }else if(status==3){
            statusstr="待清理";
        }else if(status==4){
            statusstr="停用";
        }
        return statusstr;
    }

    public void setStatusstr(String statusstr) {
        this.statusstr = statusstr;
    }

    public Room() {
    }

    public Room(String roomNumber, float price, int roomType, float deposit, int status) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.deposit = deposit;
        this.status = status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                ", deposit=" + deposit +
                ", status=" + status +
                ", statusstr='" + statusstr + '\'' +
                ", roomTypestr=" + roomTypestr +
                '}';
    }
}
