import java.util.Scanner;

public class Display_AP_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number of the series");
        int a = sc.nextInt();
        System.out.println("enter the common difference");
        int d = sc.nextInt();
        System.out.println("enter the total number of numbers u want in the series");
        int num = sc.nextInt();
        int sum = a;
        System.out.print(sum);
        for (int i = 1; i <num; i++) {
            sum = sum+d;
            System.out.print(" "+sum);
        }





    }

}
