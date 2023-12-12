import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){

// when a reverse of a number is same as the given number then the
// number is known as palindrome number eg. 121 == 121
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num; int reverse=0;
        while(temp>0){
            reverse = reverse*10+(temp%10);
            temp/=10;
        }
        if(reverse==num){
            System.out.println("its a palindrome number");
        }else{
            System.out.println("its not a palindrome number");
        }
    }
}
