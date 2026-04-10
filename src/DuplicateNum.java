import java.util.*;

public class DuplicateNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {76,24,82,94,24,98};
        int target = sc.nextInt();
        boolean found = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
                found = true;

            }
        }
        if(!found){
            System.out.println("incorrect num");
        }
    }
}
