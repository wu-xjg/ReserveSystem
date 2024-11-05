package com.example.mapper;

import com.example.entity.House;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HouseMapper {

    @Select("SELECT * FROM house")
    List<House> getAllHouses();

    @Select("SELECT * FROM house WHERE hId = #{hId} AND jId = #{jId}")
    House getHouseByIds(@Param("hId") String hId, @Param("jId") String jId);

    @Insert("INSERT INTO house (hId, jId, hClass, hTime, hMoney, hStatus) " +
            "VALUES (#{h.hId}, #{h.jId}, #{h.hClass}, #{h.hTime}, #{h.hMoney}, #{h.hStatus})")
    void insertHouse(@Param("h") House house);
    @Update("UPDATE house SET jId = #{h.jId}, hClass = #{h.hClass}, " +
            "hTime = #{h.hTime}, hMoney = #{h.hMoney}, hStatus = #{h.hStatus} " +
            "WHERE hId = #{h.hId}")
    void updateHouse(@Param("h") House house);
    @Delete("DELETE FROM house WHERE hId = #{hId} AND jId = #{jId}")
    void deleteHouseByIds(@Param("hId") String hId, @Param("jId") String jId);

}
