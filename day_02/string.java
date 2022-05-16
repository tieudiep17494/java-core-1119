package vn.techmaster;


import java.util.Locale;

public class string {

    public static void main(String[] args) {

//        khai báo biến theo kiểu literal (giá trị thể hiện chính nó)
        String name = "Hồng diep";
        String name1 = "Hồng diep";

//        khởi tạo bằng từ khóa new >> sinh ra đối tượng



       String message = new String("xin chao");
        String message1 = new String("xin chao");

        System.out.println(name);
        System.out.println(message);

//thường dc sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name == name1);
        System.out.println(message == message1);

//        equals so sánh về mặt ký tự

        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));


//        Method String
String text = "Xin chao cac ban";
        System.out.println("In hoa chữ : " +  text.toUpperCase());
        System.out.println("In thường chữ : " + text.toLowerCase());


        System.out.println("Độ dài chuỗi :" + text.length());
        System.out.println("Ký tự đầu của chuỗi :" + text.charAt(0));
        System.out.println("Ký tự đầu của chuỗi :" + text.charAt(text.length() - 1));
        System.out.println("chuoi hi có chỉ số bắt đầu là :" + text.indexOf("hi"));
        System.out.println("chuoi ch có chỉ số bắt đầu là :" + text.indexOf("ch"));

        System.out.println("chuoi hi có tồn tại trong chuỗi ban đầu k :" + text.contains("hi"));
        System.out.println("chuoi ch có tồn tại trong chuỗi ban đầu k :" + text.contains("ch"));

//        cắt chuỗi từ vị trí 0 đến 3
        System.out.println("cắt chuỗi xin : " + text.substring(0,3));

//        cắt chuỗi từ vị trí 4
        System.out.println("cắt chuỗi chào các bạn :" + text.substring(4));






    }


}
