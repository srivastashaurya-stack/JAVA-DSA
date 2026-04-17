package recursion50qst;

import java.util.*;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {35,89,76,43,16};
        int target = sc.nextInt();
        System.out.println(search(arr,target,0));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        if(arr[index] == target){
            return true;
        }

        return search(arr,target,index+1);
    }
}
