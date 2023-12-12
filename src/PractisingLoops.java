import java.util.Scanner;

public class PractisingLoops {
    public static void main(String args[]){
// while loop ; print a while loop displaying numbers from 1 to 100
//        int initial = 1; int finalnum = 100;
//        while (initial <= finalnum){
//            System.out.println(initial);
//            initial++;
//        }
// do while loop for the same
//        do{
//            System.out.println(initial);
//            initial++;
//        }while(initial<finalnum);
// for loop for the exact same question
//        for(int i = 1; i<100; i++){
//            System.out.println(i);
//        }


/* THE DIFFERENCE BETWEEN WHILE AND FOR LOOP
IS THAT WE USE WHILE LOOP WHEN WE DON'T KNOW THE EXACT AMOUNT OF
TIME THE LOOP MUST RUN, WHEREAS....
WE USE THE FOR LOOP WHEN WE KNOW EXACTLY HOW MANY TIMES THE LOOP MUST RUN
 */
// multiplication of a number
//        int number = 5;
//        for(int i = 1; i<=10; i++){
//            int multi = number*i;
//            System.out.println(number+" "+"x"+" "+i+" "+"="+" "+multi);
//        }

// sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int start = 1;
        int sum = 0;
        while(start<=number){
            sum = sum + start;
            start++;
        }
        System.out.println(sum);
    }
}
