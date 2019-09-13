package cn.itcast.springboot.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 通过@bean注解将我们定义的拦截器注册到容器中
     * @return
     */
    @Bean
    public LoginInterceptor addLoginInterceptor(){
        return new LoginInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //通过registry来注册拦截器，通过addPathPatterns来进行拦截，通过excludePathPatterns来放行
        registry.addInterceptor(addLoginInterceptor()).addPathPatterns("/*");
    }
}
