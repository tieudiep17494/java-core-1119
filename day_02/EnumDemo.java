package vn.techmaster;


enum Role{
    ADMIN , USER, SALE, TEACHER
}


public class EnumDemo {

//    khai báo enum trong nội bộ class
    enum Gender {
        MALE , FEMALE
}
    public static void main(String[] args) {

        System.out.println(Gender.MALE);
        System.out.println("Gioi tinh cua toi la : " + Gender.FEMALE);

        System.out.println("toi dang la " + Role.ADMIN  + " cua 1 trang web");

        System.out.println("thang 4 dang la " + vn.techmaster.Season.SUMMER);

    }

}
