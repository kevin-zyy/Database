package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

//一般以查询的表+Mapper命名
//如表名为tb_user，类名为user，请在类名上加入@TableName("tb_user")
@Mapper
public interface UserMapper extends BaseMapper<User> {
//这部分是mybatis的，mybatis-plus进行了简化
    @Insert("insert into t_user values(#{id}, #{order_time}, #{total}, #{uid})")
    int insert(User user);
//
//    @Update("update user set username=#{name}, age=#{age}, gender=#{gender} where id=#{id}")
//    int update(User user);
//
//    @Delete("delete from user where id=#{id}")
//    int delete(int id);
//
//    @Select("select * from user")
//    List<User> find();
    //查询单个用户
    @Select("select * from t_user where id=#{id}")
    User findById(int id);
    //查询所有用户及其订单
    @Select("select * from t_user")
    //前面代表表里的字段，后面代表User类里的字段
    List<User> selectAllUserAndOrders();

}