package com.scce.service.impl;

import com.scce.dao.BillDao;
import com.scce.dao.RoomTypeDao;
import com.scce.pojo.RoomType;
import com.scce.pojo.Roomchartwithbill;
import com.scce.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-03 21:17
 **/
@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Autowired
    private BillDao billDao;

    @Autowired
    private RoomTypeDao roomTypeDao;

    @Override
    public List<Roomchartwithbill> getBillNumByRoomType() {
        List<Roomchartwithbill> list = new ArrayList<Roomchartwithbill>();
        List<RoomType> roomTypeList = roomTypeDao.getRoomType();
        try {
            for (RoomType roomType : roomTypeList) {
                Integer num = billDao.getBillNumByRoomType(roomType.getRid());
                Roomchartwithbill roomchartwithbill = new Roomchartwithbill();
                roomchartwithbill.setBillnumber(num);
                roomchartwithbill.setRoomtype(roomType.getType());
                System.out.println(roomchartwithbill);
                list.add(roomchartwithbill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
