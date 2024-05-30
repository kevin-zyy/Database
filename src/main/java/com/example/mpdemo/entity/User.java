package com.example.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.core.annotation.Order;

import java.util.List;
public class User {
    @TableId(type = IdType.AUTO)
    private int id;
    private String order_time;
    private int total;
    private String uid;
    //描述用户所有的订单
    @TableField(exist = false)
    private List<Order> orders;

    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderTime() {
        return order_time;
    }

    public void setOrderTime(String order_time) {
        this.order_time = order_time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_time='" + order_time + '\'' +
                ", total=" + total +
                ", uid='" + uid + '\'' +
                '}';
    }
}