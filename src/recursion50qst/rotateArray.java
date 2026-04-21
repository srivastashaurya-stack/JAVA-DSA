package recursion50qst;
import java.util.*;

public class rotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {65,83,72,85,24};
        int k = sc.nextInt();

        rotate(arr,k);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }

    static void rotate(int[] arr, int k){
        int n = arr.length;
        if(n == 0){
            return;
        }

        k = k%n;
        if(k==0){
            return;
        }

        int last = arr[n-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        rotate(arr,k-1);
    }
}
