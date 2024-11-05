package com.example.mapper;

import com.example.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM `order`")
    List<Order> getAllOrders();

    @Select("SELECT * FROM `order` WHERE oId = #{oId} AND uId = #{uId} AND jId = #{jId} AND hId = #{hId}")
    Order getOrderByIds(@Param("oId") String oId, @Param("uId") String uId, @Param("jId") String jId, @Param("hId") String hId);

    @Insert("INSERT INTO `order` (oId, uId, jId, hId, oTime, oMoney, oStatus, oEvaluate) " +
            "VALUES (#{o.oId}, #{o.uId}, #{o.jId}, #{o.hId}, #{o.oTime}, #{o.oMoney}, #{o.oStatus}, #{o.oEvaluate})")
    void insertOrder(@Param("o") Order order);

    @Update("UPDATE `order` SET uId = #{o.uId}, jId = #{o.jId}, hId = #{o.hId}, " +
            "oTime = #{o.oTime}, oMoney = #{o.oMoney}, oStatus = #{o.oStatus}, oEvaluate = #{o.oEvaluate} " +
            "WHERE oId = #{o.oId}")
    void updateOrder(@Param("o") Order order);
    @Delete("DELETE FROM `order` WHERE oId = #{oId} AND uId = #{uId} AND jId = #{jId} AND hId = #{hId}")
    void deleteOrderByIds(@Param("oId") String oId, @Param("uId") String uId, @Param("jId") String jId, @Param("hId") String hId);

}
