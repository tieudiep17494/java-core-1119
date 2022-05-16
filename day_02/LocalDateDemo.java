package vn.techmaster;


import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {


//        lấy ngày hiện tại
        LocalDate ld = LocalDate.now();
        System.out.println(ld);



        //        chỉ định ngày tháng

        LocalDate ld1 = LocalDate.of(2022,9,21);
        System.out.println(ld1);

//        lấy ra năm hiện tại
        System.out.println("năm hiện tại : " + ld.getYear());
        System.out.println("tháng hiện tại : " + ld.getMonth().getValue());
        System.out.println("ngày hiện tại : " + ld.getDayOfWeek());


//        thay đổi thời gian
//cộng
        System.out.println(ld.plusYears(2));

//        trừ
        System.out.println(ld.minusMonths(2));

//        kiểm tra năm nhuận

        System.out.println(ld.getYear() + " co la nam nhuan k : " + ld.isLeapYear());
        System.out.println(ld.plusYears(2).getYear() + " co la nam nhuan k : "
                + ld.plusYears(2).isLeapYear());

//        so sánh
        System.out.println(ld.equals(ld1));
        System.out.println(ld.isBefore(ld1));
        System.out.println(ld.isAfter(ld1));

//        format định dạng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM,yyyy");

        String strDate = ld.format(formatter); // áp dụng format cho đối tượng ld
        System.out.println(strDate);


    }
}
