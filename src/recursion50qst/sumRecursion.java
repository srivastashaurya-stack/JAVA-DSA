package recursion50qst;

public class sumRecursion {
    public static int getSum(int n) {

//        if(n==1){
//            return 1;
//        }
//        return n+(n-1);
//
        return (n == 1) ? 1 : n + getSum(n - 1);
    }

    public static void main(String[] args){
//        int result = getSum(6);
            System.out.println(getSum(6));
    }
}
