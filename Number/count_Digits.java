import java.util.Scanner;

public class count_Digits {

    public static int countDigits(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.print(countDigits(num) + " ");
        }
    }
}