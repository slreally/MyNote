package com.hushuli.dao;

import com.hushuli.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> findAll();

    //使用注解开发，这样就不需要在 xml 中实现方法
    //@Param 基本数据类型和String需要加上，引用数据类型不需要加，单个参数不需要加，但是建议加上
    @Select("select * from user where id = #{id}")
    User findById(@Param("int") int id);

    int insert(User user);
    //分页查询 使用 sql 的 limit
    List<User> findLimit(HashMap<String, Integer> map);

    //动态sql
    List<User> findDynamic(HashMap map);

    //结果映射
    User findResultMap(int id);
}
