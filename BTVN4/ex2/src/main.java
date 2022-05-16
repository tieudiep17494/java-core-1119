import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");

        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }
        System.out.println("Array are: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Transformed array are: ");
        System.out.println(Arrays.toString(transformed(array)));


    }


    public static int[] transformed(int[] arrays) {
        int[] newArray = new int[arrays.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrays[i] % 2 == 0 ? arrays[i] : arrays[i] + 1;
        }

        return newArray;

    }
}
