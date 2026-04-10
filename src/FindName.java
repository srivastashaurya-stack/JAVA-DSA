import java.util.*;

public class FindName {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        String[] name = {"Balthakre", "yogi", "modi", "himanta"};


        String target = sc.next();
        boolean found = false;


        for(int i = 0; i<name.length; i++){
            if(name[i].equals(target)){
                System.out.println("the OG is" + i);
                found = true;
            }
        }
        if(!found){
            System.out.println("incorrect name");
        }
    }
}
