package vn.techmaster;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
         Method m = new Method();
                 m.sayHello();
                m.sayHelloWithName("hong diep");     // argument:đối số
                 m.sayHelloWithName("nguyen van A");
        int a = 10;
        int b = 20;

        int data = m.sum(a, b);
        System.out.println("data = " + data);
        System.out.println("m.sum(data, 70) = " + m.sum(data, 70));
        System.out.println("dd");
        System.out.println("data = " + data);

    }

    public    void sayHello() {
        System.out.println("xin chao cac ban");

    }

    public void sayHelloWithName(String name) { // tham số : paramenter
        System.out.println("xin chao " + name);
    }

    public int sum(int a, int b){
//        int data = a + b ;
//        return data;

        return a + b;
    }


}
