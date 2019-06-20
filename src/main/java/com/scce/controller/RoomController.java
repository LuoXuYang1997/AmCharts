package com.scce.controller;

import com.scce.pojo.RoomType;
import com.scce.pojo.Roomchart;
import com.scce.service.RoomService;
import com.scce.service.RoomTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomTypeService roomTypeService;


    //roomchart条形图，根据房间类型显示房间总数和可入住的房间数量
    @RequestMapping("/getRoomNum")
    public List<Roomchart> getRoomNum() throws Exception {
        //创建集合，存放条形图显示所需数据
        List<Roomchart> list = new ArrayList<Roomchart>();
        //查询出所有房间类型
        List<RoomType> roomTypeList = roomTypeService.getAllRoomType();
        System.out.println(roomTypeList);
        try {
            //遍历房间类型
            for (RoomType roomType : roomTypeList) {
                //根据房间类型查询房间数量
                Integer roomNum = roomService.getRoomNum(roomType.getId());
                //根据房间类型查询可入住房间数量
                Integer inRoomNum = roomService.getInRoomNum(roomType.getId());
                //把数据封装到实体类中
                Roomchart roomchart = new Roomchart();
                roomchart.setRoomNum(roomNum);
                roomchart.setInRoomNum(inRoomNum);
                roomchart.setRoomtypestr(roomType.getType());
                //将对象放入集合
                list.add(roomchart);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}



