package vn.techmaster;


public class FinalKeyword {

    public static final int age = 30;
    public static void main(String[] args) {
//        vừa khai báo vừa khởi tạo giá trị
        final String name = "anna";

//        khai báo hằng số nên viết hoa
        final  String FIRST_NAME = "bob";

//        khai báo trước khởi tạo giá trị sau
        final double PI;
//        PI =  3,14 ;


        System.out.println(name);
        System.out.println(FIRST_NAME);


//        thay đổi giá trị của hằng số
//        PI = 4; >> k thể thực hiện gán lại giá trị


//        tham chiếu đến biến global
        System.out.println(age);


        FinalKeyword f = new FinalKeyword();
        System.out.println(f.age);

        System.out.println(sum(10,20));
        System.out.println(f.sum(10,20));

    }

    public static final int sum(int a, int b){
        return a + b;

    }
}
