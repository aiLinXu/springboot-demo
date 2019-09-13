package cn.itcast.springboot.annotation;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@MyAnnotation
public class Annotation {
    public static void main(String[] args) {
        MyAnnotation annotation = Annotation.class.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);
    }
}
