package com.scce.controller;

import com.scce.pojo.Roomchartwithbill;
import com.scce.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-04 00:06
 **/
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;



//饼状图 房间类型订单数量图
    @RequestMapping("/getBillNumByRoomType")
    public List<Roomchartwithbill> getBillNumByRoomType() {
        System.out.println("进入getBillNumByRoomType");
        List<Roomchartwithbill> list = billService.getBillNumByRoomType();
        return list;
    }


}
