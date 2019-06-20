package com.scce.service;

//客房管理
public interface RoomService {
    //查询每种房间类型数量
    public Integer getRoomNum(Integer roomType);
    //查询每种房间类型可入住房间数量
    public Integer getInRoomNum(Integer roomType);
}
