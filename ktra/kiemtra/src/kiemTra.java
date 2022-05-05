import java.util.Scanner;


public class kiemTra {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        hinhVuong();
        hinhTamGiac();
        songuyento();
        System.out.println("");
        chuoi();
        bai4();
        mang();
    }

//    bai 1
    public static void hinhVuong() {
        int height ;

        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("canh hinh vuong  = ");
         height = sc.nextInt();

        for ( i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void hinhTamGiac() {
        int height ;

        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("chieu cao tam giac  = ");
        height = sc.nextInt();

        for ( i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    //bai 3
    public static void songuyento()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhap so = ");
        n = sc.nextInt();
        if (isPrimeNumber(n))
        {
            System.out.println(n + " la so nguyen to");
        }
        else
            System.out.println(n + " khong la so nguyen to");

        System.out.println("");
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//    bai 2
    public static void chuoi() {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        char kytu  = 'o';
        String vitri = new String("");

        String txt;
        System.out.print("nhap chuoi :");
        txt = sc.next();

        System.out.println("so tu trong chuoi :" + txt.length());
        for (int i = 0; i< txt.length(); i++)
        {
            if( txt.charAt(i) ==  kytu)
            {
                dem++;
               vitri += String.valueOf(i)+"  ";
            }
        }
        System.out.println("so lan xuat hien cua o trong chuoi la :" + dem + " vi tri : " + vitri);

    }

//    bai 4

    public static void bai4(){
        System.out.print("nhap n = " );
        int n = sc.nextInt();
        System.out.printf("%d so nguyen to dau tien la : \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimeNumber(i)){
                System.out.print(i +  " ");
                dem++;

            }
            i++;
        }
        System.out.println("");
        System.out.printf("cac so nguyen to nho hon %d la: \n", n);


        for ( i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }



    }


//    bai 5

    public static void mang() {
        int sodong, socot;
        System.out.print("so dong :");
        sodong = sc.nextInt();

        System.out.print("so cot :");
        socot = sc.nextInt();
        int[][] a = new int[sodong][socot];
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {

                System.out.print("phan tu thu [" + i + "][" + j + "] la : ");
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("");
        System.out.println("mang vua nhap : ");
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        int sum = 0;

        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {

                if (i == j) {
                    sum += a[i][j];
                }
            }

        }
        System.out.print("Tong cac so duong cheo chinh : " + sum);
        System.out.println("");
        // cong mang
        int cotmoi = 0;
        int dongmoi = 0;
         int[][] b = new int[sodong][socot];
        int[][] c = new int[0][0];
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {

                System.out.print("phan tu thu [" + i + "][" + j + "] la : ");
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("");
        System.out.println("mang thu 2 : ");
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {

                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("mang  moi la : ");
        for (int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                c[i][j] = a[i][j]+b[i][j];

                System.out.print(c[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}


