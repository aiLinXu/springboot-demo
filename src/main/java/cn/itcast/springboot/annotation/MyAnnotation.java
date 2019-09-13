package cn.itcast.springboot.annotation;

import java.lang.annotation.*;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@Target(ElementType.TYPE)   //该注解作用的范围
@Retention(RetentionPolicy.RUNTIME)    //该注解的生命周期
@Documented
public @interface MyAnnotation {
}
