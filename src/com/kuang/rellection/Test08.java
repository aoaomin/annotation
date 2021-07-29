package com.kuang.rellection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.kuang.rellection.User");
        //获得类的名字
        System.out.println(c1.getName());//获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名
        //获得类的属性
        Field[] fields = c1.getDeclaredFields();
        List<Field> fields1 = Arrays.asList(fields);
        fields1.forEach(field -> {
            System.out.println(field);//arrlist集合打印
        });
        //        for (Field field : fields) {
        //            System.out.println(field);//加强for循环打印
        //
        //        }
        //获得类的单个属性
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        //获得类的方法
        System.out.println("=================================================");
        Method[] methods = c1.getMethods();//获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的="+method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //获得指定方法
        Method getname = c1.getMethod("getName",null);
        Method setname = c1.getMethod("setName", String.class);
        System.out.println(getname);
        System.out.println(setname);


    }

}

