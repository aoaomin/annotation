package com.kuang.annotation;

import java.lang.annotation.*;

//测试元注解
public class Test02 {
    @MyAnnotation
    public void test() {

    }
}

//定义一个注解
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//Retention表示我们的注解在什么地方有效
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented
//子类可以竭诚父类的注解
@Inherited
@interface MyAnnotation {

}