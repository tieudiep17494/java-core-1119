package vn.techmaster;


import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {

        Scanner sc = new sc(System.in);

        System.out.println("nhập vào chiều dài : ");
        double length = sc.nextDouble();


        System.out.println("nhập vào chiều rộng : ");
        double width = sc.nextDouble();

        double chuVi = (length + width) * 2;

        double dienTich = length * width;

        System.out.println("Chu vi : " + chuVi);

        System.out.println("Dien tich : " + dienTich);

    }



}
