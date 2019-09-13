package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@SpringBootApplication
@MapperScan("cn.itcast.springboot.mapper")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
