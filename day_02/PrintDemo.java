package vn.techmaster;


public class PrintDemo {
    public static void main(String[] args) {
        System.out.println("My name is Diep");

        System.out.print("My name is Diep\n");
        System.out.print("\t\tI'm fine\n");


        System.out.printf("My name is %s. I'm %d yeasr old . Point = %.2f\n" , "Diep" , 25, 9.87895);

//        Bảng dữ liệu cơ bản
//        name  email age
        System.out.printf("%20s %20s %10d\n", "ho ten", "'email", "tuoi");

        System.out.printf( " %20s  %20s  %10d\n", "hong diep" ,"abcdf@gmail.com",  25);
        System.out.printf( " %20s  %20s  %10d\n", "hong anh" ,"absfafcdf@gmail.com",  23);
        System.out.printf( " %20s  %20s  %10d\n", "hong hanh" ,"abcđấdf@gmail.com",  22);



    }
}
