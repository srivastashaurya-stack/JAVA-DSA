import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50,60,70,80,90};

        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        boolean found = false;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                System.out.println("num at index " + mid);
                found = true;
                break;
            } else if(target <= arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if(!found){
            System.out.println("incorrects num");
        }
    }
}
