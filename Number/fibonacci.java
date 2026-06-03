import java.util.Scanner;

public class fibonacci {

    public static void fibonacci(int n) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            fibonacci(num);
        }
    }
}