package recursion50qst;

public class isSortedRecursion {
    public static void main(String[] args){
        int[] arr = {76,98,54,43,89};
        System.out.println(isSorted(arr ,0));
    }

    static boolean isSorted(int[]arr, int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index]> arr[index+1]){
            return false;
        }

        return isSorted(arr, index +1);
    }
}
