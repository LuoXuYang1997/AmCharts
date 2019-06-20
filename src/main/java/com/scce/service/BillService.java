package com.scce.service;

import com.scce.pojo.Roomchartwithbill;

import java.util.List;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-03 21:16
 **/
public interface BillService {



    //根据房间类型，查询订单数量
    public List<Roomchartwithbill> getBillNumByRoomType();


}
