import java.util.Scanner;

public class Perfect {

    public static boolean isPerfect(int n) {

        if (n <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }
    }
}