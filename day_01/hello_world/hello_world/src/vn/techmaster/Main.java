package vn.techmaster;
//khai báo biến global

//public static int globalVariable = 20 ;
public class Main {
    public static void main(String[] args) {
//        chuong trinh dau tien
        System.out.println("Hello world");
        //khai bao bien
        String firstName;
        String lastName;

//        khởi tạo giá trị cho biến

        firstName = "diep" ;
        lastName = "hong" ;

//        in ra biến


        System.out.println(firstName);
        System.out.println(lastName);


//        vừa khai báo fa khởi tạo giá trị cho biến

//        String fullName = "Hồng Điệp";
//        System.out.println(fullName);

        String fullName = firstName + "" + lastName;
        System.out.println(fullName);

        int age = 25;
        System.out.println( " xin chao cac ban , tôi tên là " + fullName +
               " Mình sinh năm " + (2022-25) + " và năm nay mình " + age + " tuổi");

//        kiểu long

        long money = 2_000_000_000L;
        System.out.println("Tài khoản có gì ngoài tiền, chỉ có " + money + "tỷ thôi");

//        kiểu boolean (đúng sai)

        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried + "la chua lay vk nhe");
        System.out.println("isMarried = " + !isMarried + "la da lay vk nhe");
//khai báo dấu phẩy động

        float weight = 60.5f;
        double height = 1.68;

        System.out.println("can nang = " + weight);
        System.out.println("chieu cao = " + height);

//        kiểu ký tự search ASCII trên GG

        char charA = 'A';
        char chara = 97;

        System.out.println(charA);
        System.out.println(chara);
//ép kiểu ngầm định từ giá trị nhỏ >> giá trị lớn,trình biên dịch tự biết và thực hiện


        int number = 10;
        long number1 = number;
        double number2 = number;
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
//ép kiểu tường mình : từ lớn >> nhỏ,,tự làm

        double heightValue = 1.8;
        int heightValueConvert = (int) heightValue;

        System.out.println(heightValueConvert);

//        phạm vi của biến

        {
            int localVaribale = 10;
            System.out.println(localVaribale);
        }
//        lỗi ngoài phạm vi
//        System.out.println(localVaribale);
//        System.out.println(globalVariable);

    }

    int globalVariable = 20;

}

