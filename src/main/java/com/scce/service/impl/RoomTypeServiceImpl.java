package com.scce.service.impl;

import com.scce.dao.RoomTypeDao;
import com.scce.pojo.RoomType;
import com.scce.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoomTypeServiceImpl implements RoomTypeService{

    @Autowired
    private RoomTypeDao roomTypeDao;

    //查询所有房间类型信息
    public List<RoomType> getAllRoomType() {
        List<RoomType> roomTypeList = roomTypeDao.getRoomType();
        return roomTypeList;
    }

}
