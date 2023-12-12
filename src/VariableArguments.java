import java.sql.SQLOutput;

public class VariableArguments {
//    Basic syntax of how the method works.
    static void show(String...A){
        for (int i = 0; i < A.length; i++) {
            System.out.println(i+1+". "+A[i]);
        }
    }

// Q1. Find the maximum number from the following list of integers.

    static int max(int...A){
        if(A.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = A[0];
        for(int i = 1; i< A.length; i++){
            if(A[i]> max){
                max = A[i];
            }
        }
        return max;
    }

// Q2. Sum of all the elements using varargs.

    static int sum(int...A){
        if(A.length == 0){
            return -1;
        }
        int sum = A[0];
        for(int i = 1; i<A.length; i++){
            sum = sum + A[i];
        }
        return sum;
    }

// Q3. Calculate discount using varargs.
    static double discount(double...prices){
        if(prices.length == 0){
            return -1;
        }
        double sum = prices[0];
        for (int i = 1; i <prices.length ; i++) {
            sum = sum + prices[i];
        }
        if(sum==500){
            return 15;
        } else if (500<sum && sum<1000) {
            return 20;
        }else{
            return 21;
        }
    }


    public static void main(String args[]){
//     show("Anup", "Jay","Suresh","Deepika");
//       System.out.println(max());
//       System.out.print(sum(2,3,4,5,6,8));
       System.out.print(discount(500,1000)+"% or more");
    }

}
