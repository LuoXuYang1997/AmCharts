package com.scce.dao;
import org.apache.ibatis.annotations.Select;

//客房管理
public interface RoomDao {
    //查询每种房间类型数量（Lxy）
    @Select("select count(1) from room where roomType=#{roomType}")
    public Integer getRoomNum(Integer roomType);

    //查询每种房间类型可入住房间数量（Lxy）
    @Select("select count(1) from room  where status=1 and roomType=#{roomType}")
    public Integer getInRoomNum(Integer roomType);

}
