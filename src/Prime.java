import java.util.Scanner;

public class Prime {
// check whether the number is prime or not
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num == 0 || num < 0){
            System.out.println("enter a valid number");
        }
       System.out.println(isPrime(num));
//        Prime mp = new Prime();
//        System.out.println(mp.isPrime(num));
    }
    static boolean isPrime(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

}
