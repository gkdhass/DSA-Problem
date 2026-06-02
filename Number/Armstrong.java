import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int n) {

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }
}