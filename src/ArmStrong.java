import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[]){
// Display each digit
//        int number = 234456;
//        int[] arr = new int[6];
//        int counter = arr.length-1;
//        while(number>0){
//            int digit = number%10;
//            arr[counter] = digit;
//            counter--;
//            number/=10;
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//
//        }
// count digits in a number
//        int count = 0;
//        while (number>0){
//            count++;
//            number/=10;
//        }
//        System.out.println(count);

// Armstrong number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num; int sum = 0;
        while(temp>0){
           sum= sum+((temp%10)*(temp%10)*(temp%10));
           temp/=10;
        }
        if(sum==num){
            System.out.println("its an armstrong number");
        }else{
            System.out.println("its not an armstrong number");
        }

    }
}
