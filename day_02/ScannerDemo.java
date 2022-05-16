package vn.techmaster;

import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
//        khởi tạo đối tượng scaner
        Scanner sc = new Scanner(System.in);


        System.out.println("nhap ten :");

        String name = sc.nextLine();

        System.out.println("nhap que quan :");
        String address = sc.nextLine();

        System.out.println("nhập tuoi :");
//        int age = Integer.parseInt(sc.nextLine());

        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("nhap email ; ");
        String email = sc.nextLine();


        System.out.println("toi ten la " + name + ". năm nay toi " + age + "tuoi, que quan o " + address + "email" + email) ;

//
////        BMi
//        System.out.println("Nhập cân nặng  (kg) : ");
//        double  weight = sc.nextDouble();
//
//        System.out.println("Nhập chiều cao (m) : ");
//        double height = sc.nextDouble();
//
//        System.out.println( " với weight =  " + weight + " và height = " + height + " thì chỉ số BMI = " +   calculateBMI(weight, height) );
//
//
//
//
//
//a
    }
//
////    tính chỉ số bmi
//
//    public static
}
