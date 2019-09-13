package cn.itcast.springboot.controller;

import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/user/{id}")
    public User queryById(@PathVariable("id") Long id){
        User user = userServices.queryById(id);
        return user;

    }

}
