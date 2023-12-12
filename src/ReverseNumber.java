import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
// print the reverse of the given number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
//        while(num>0){
//            reverse= num%10;
//            System.out.print(reverse);
//            num/=10;
//        }

// another method
        while(num>0){
            reverse = reverse*10+(num%10);
            num/=10;
        }
        System.out.println(reverse);
    }
}
