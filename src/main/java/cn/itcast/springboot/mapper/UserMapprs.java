package cn.itcast.springboot.mapper;

import cn.itcast.springboot.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Repository
public interface UserMapprs extends Mapper<User> {

}

