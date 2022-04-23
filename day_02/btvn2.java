package vn.techmaster;


import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten");
        String name = sc.nextLine();

        System.out.println("nhap tuoi");
        String age = sc.nextLine();

        System.out.println("gioi tinh");
        String sex = sc.nextLine();

        System.out.println("dia chi");
        String address = sc.nextLine();

        System.out.println("toi ten la : " + name + "nam nay toi :" + age + "gioi tinh : " + sex
        + "den tu : " + address);



    }
}
