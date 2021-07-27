package com.kuang.rellection;

public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是:"+person.name);
        //方式一：通过对象获得
        Class c1 = person.getClass();
        //方式二：通过forname获得

        Class c2 = Class.forName("com.kuang.rellection.Student");
        System.out.println(c2);
    }


}
class Person{
    public String name;

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
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person {
    public Teacher(){
        this.name = "老师";
    }
}

