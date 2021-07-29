package com.kuang.rellection;

public class Test5 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
        /*
        1.加载到内存，会产生一个类对应的class对象
        2.链接，链接结束后m=0
        3.初始化

         */
    }
}

class A{
    static {
        System.out.println("A类静态代码初始化");
        m=300;
    }
    static int m = 100;

    public A() {
        System.out.println("A类的无参的构造初始化");
    }
}
