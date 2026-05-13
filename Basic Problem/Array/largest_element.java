import java.util.*;
public class largest_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int large = arr[0];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println("THe Largest Element is "+ large);
    }
}