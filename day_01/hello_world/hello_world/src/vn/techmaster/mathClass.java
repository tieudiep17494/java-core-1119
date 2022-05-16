package vn.techmaster;

public class mathClass {
    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        System.out.println(Math.abs(-8));
        System.out.println(Math.abs(8));


//        làm trong lên

        System.out.println(Math.ceil(1.9));
        System.out.println(Math.ceil(1.1));

//        làm tròn xuống

        System.out.println(Math.floor(1.9));
        System.out.println(Math.floor(1.1));


        System.out.println(Math.round(1.9));
        System.out.println(Math.round(1.1));


//        căn

        System.out.println(Math.pow(2,4));

//        căn 2

        System.out.println(Math.sqrt(9));

//        random

        System.out.println(Math.random());


//        random 1 số trong khoảng từ 0 >> 10

int randomNumber = (int) Math.floor(Math.random() * 11);
        System.out.println(randomNumber);

//        random 1 số từ 10 >> 100 (max-min+1)+min
        int randomNumber1 = (int) Math.floor(Math.random() * (100-10+1)+10);
        System.out.println(randomNumber1);


    }


}
