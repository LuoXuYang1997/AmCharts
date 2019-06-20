package com.scce.service.impl;

;
import com.scce.dao.RoomDao;

import com.scce.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;

    //根据房间类型查询房间数量
    @Override
    public Integer getRoomNum(Integer roomType) {
        Integer roomNum = roomDao.getRoomNum(roomType);
        System.out.println(roomNum);
        return roomNum;
    }

    //根据房间类型查询可入住房间数量
    @Override
    public Integer getInRoomNum(Integer roomType) {
        Integer inRoomNum = roomDao.getInRoomNum(roomType);
        System.out.println(inRoomNum);
        return inRoomNum;
    }


}
