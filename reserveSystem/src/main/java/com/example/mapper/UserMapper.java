package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> getAllUsers();

    @Select("SELECT * FROM user WHERE uId = #{uId}")
    User getUserById(String uId);

    @Insert("INSERT INTO user (uId, uName, uPwd, uPhone, uNumber, uSex, uAuthority, uStatus) " +
            "VALUES (#{u.uId}, #{u.uName}, #{u.uPwd}, #{u.uPhone}, #{u.uNumber}, #{u.uSex}, #{u.uAuthority}, #{u.uStatus})")
    void insertUser(@Param("u") User user);
    @Update("UPDATE user SET uName = #{u.uName}, uPhone = #{u.uPhone}, " +
            "uNumber = #{u.uNumber}, uSex = #{u.uSex}, uAuthority = #{u.uAuthority}, uStatus = #{u.uStatus} " +
            "WHERE uId = #{u.uId}")
    void updateUser(@Param("u") User user);
    @Delete("DELETE FROM user WHERE uId = #{uId}")
    void deleteUserById(@Param("uId") String uId);

}
