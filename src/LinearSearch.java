import java.util.Scanner;

public class LinearSearch { public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int []arr = {75,83,65,92,45,94};
    int target = sc.nextInt();
    boolean found = false;

    for(int i = 0; i<arr.length; i++){
        if(arr[i] == target){
            System.out.println(i);
            found = true;
            break;
        }
    }
    if(found == false){
        System.out.println("num not found");
    }
}
}
