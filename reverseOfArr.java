import java.util.*;

public class reverseOfArr{
    
    public static void printarr(int i, int[] arr, int n) {
        if (i >= n) {
            return;
        }
        printarr(i + 1, arr, n);
        System.out.print(arr[i]); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        printarr(0, arr, n);
        sc.close();
    }
}
