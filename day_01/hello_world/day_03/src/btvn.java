import java.lang.reflect.Method;

public class btvn {
    public static void main(String[] args) {
        chain();
        chain1();
    }

    private static void chain() {
        String chuoi = "a";
        char count= 10 ;


        System.out.println("chuoi  : "   +  chuoi.repeat(count));

    }
    private static void chain1(){
        String chuoi1 = "a";
       char count = 10 ;
        chuoi1 = chuoi1 + "-";


        System.out.println("chuoi1 :" + chuoi1.repeat(count));

    }








}


















