import java.util.Scanner;

public class swap {

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        swap(arr[0], arr[1]);
    }
}