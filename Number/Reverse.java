import java.util.Scanner;

public class Reverse {

    public static int reverseNumber(int n) {

        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.print(reverseNumber(num) + " ");
        }
    }
}