package com.scce.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-02 21:36
 **/
public interface BillDao {

    //根据房间类型，查询订单数量
    @Select("select count(1) from bill where roomType=#{roomType}")
    public Integer getBillNumByRoomType(Integer roomtype);

}
