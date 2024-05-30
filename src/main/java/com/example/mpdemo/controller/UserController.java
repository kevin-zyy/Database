package com.example.mpdemo.controller;

import com.example.mpdemo.entity.User;
import com.example.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    //自动注入
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> find() {
        return userMapper.selectAllUserAndOrders();
    }


    @PostMapping("/user/insert")
    public String save(User user){
        int i = userMapper.insert(user);
        if (i>0) {
            return "插入成功,插入了"+i+"条";
        }
        return "插入失败";
    }
    @PostMapping("/user1")
    public String delete(User user){
        int i = userMapper.deleteById(user.getId());
        if (i>0) {
            return "删除成功,插入了"+i+"条";
        }
        return "删除失败";
    }
}
