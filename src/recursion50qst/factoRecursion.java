package recursion50qst;

public class factoRecursion {
    public static long facto(long n){

        return (n==1)?1:n*facto(n-1);
    }

    public static void main(String[] args){
        System.out.println(facto(6));
    }
}
