import java.util.Scanner;

public class Even_or_Odd {

    public static boolean isEven(int n) {

        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {

            if (isEven(num)) {
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        }
    }
}