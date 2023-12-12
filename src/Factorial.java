import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        // finding factorial of a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which u want to find the factorial");
        int num = sc.nextInt();
        if(num>0){
            int fact = 1;
            for(int i = 1; i<=num; i++){
                fact = fact*i;
            }
            System.out.println("Factorial of "+num+" is "+fact);
        }else{
            System.out.println("Please enter a valid number");
        }

    }
}
