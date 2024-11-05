package com.example.mapper;

import com.example.entity.Hotel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HotelMapper {

    @Select("SELECT * FROM jiudian")
    List<Hotel> getAllHotels();

    @Select("SELECT * FROM jiudian WHERE jId = #{jId} AND bId = #{bId}")
    Hotel getHotelByIds(@Param("jId") String jId, @Param("bId") String bId);

    @Insert("INSERT INTO jiudian (jId, jName, jAddress, jLevel, jIntroduction, bId, jNumber) " +
            "VALUES (#{j.jId}, #{j.jName}, #{j.jAddress}, #{j.jLevel}, #{j.jIntroduction}, #{j.bId}, #{j.jNumber})")
    void insertHotel(@Param("j") Hotel hotel);

    @Update("UPDATE jiudian SET jName = #{j.jName}, jAddress = #{j.jAddress}, " +
            "jLevel = #{j.jLevel}, jIntroduction = #{j.jIntroduction}, bId = #{j.bId}, jNumber = #{j.jNumber} " +
            "WHERE jId = #{j.jId}")
    void updateHotel(@Param("j") Hotel hotel);
    @Delete("DELETE FROM jiudian WHERE jId = #{jId} AND bId = #{bId}")
    void deleteHotelByIds(@Param("jId") String jId, @Param("bId") String bId);

}

