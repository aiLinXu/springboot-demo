package cn.itcast.springboot.service;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        User user = userMapper.queryById(id);
        System.out.println("user = " + user);
        return user;
    }
}
