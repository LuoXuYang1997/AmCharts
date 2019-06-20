package com.scce.dao;

import com.scce.pojo.RoomType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//客房管理
public interface RoomTypeDao {
    //查询房间类型
    @Select("select * from roomtype")
    public List<RoomType> getRoomType();

}
