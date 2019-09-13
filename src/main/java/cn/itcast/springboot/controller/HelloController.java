package cn.itcast.springboot.controller;

import cn.itcast.springboot.config.Config;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@RestController
public class HelloController {

    @Autowired
    private Config config;

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String helloDemo(){
        System.out.println(config);
        return "springboot hello!";
    }

    @GetMapping("/hello/{id}")
    public User queryUser(@PathVariable("id") Long id){
        User user = userService.queryById(id);
        return user;
    }
}
