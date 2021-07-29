package com.kuang.rellection;

import javax.swing.text.Style;
import java.lang.reflect.Field;

//测试class类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Person person = new Student();
//        System.out.println("这个人是:"+person.name);
        //方式一：通过对象获得

        Class c1 = person.getClass();

        System.out.println(c1);
//            System.out.println(c1.getDeclaredField("name")+"asdasdasdasd");
//        Field c99 = c1.getDeclaredField("name");
//        System.out.println(c99);


        System.out.println(c1.hashCode());
        //方式二：通过forname获得

        Class c2 = Class.forName("com.kuang.rellection.Student");
        System.out.println(c2.hashCode());
        Class c999 = Class.forName("com.kuang.rellection.User");
        Field fields = c999.getDeclaredField("name");
        System.out.println(fields+"asdasd");
//        System.out.println(c2.getName());//获得包名+类名
//        System.out.println(c2.getSimpleName());//获得类名
        Field c99 = c2.getField("name");
        System.out.println(c99);
        //方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        //方式四：基本内置类型的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        System.out.println(c4.hashCode());
        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
        System.out.println(c1.getSuperclass());

    }


}
class Person{
    private String name;
    public  String sex ="kk" ;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person {

//    public Student(){
//        this.name = "学生";
//    }
}
class Teacher extends Person {
//    public Teacher(){
//        this.name = "老师";
//    }
}

