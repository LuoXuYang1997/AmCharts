package com.scce.service;

import com.scce.pojo.RoomType;

import java.util.List;

//客房管理
public interface RoomTypeService {
    //查询所有房间类型信息
    public List<RoomType> getAllRoomType()throws Exception;

}
