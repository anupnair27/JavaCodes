import java.util.Scanner;

public class NumberInWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
         String str ="";int remainder = 0;
            while(number>0){
                remainder = (number%10);
                str+=remainder;
                number/=10;
            }

        for (int i = str.length()-1; i >=0 ; i--) {
            switch (str.charAt(i)){
                case '0':
                    System.out.print("zero");
                    break;
                case '1':
                    System.out.print("one");
                    break;
                case '2':
                    System.out.print("two");
                    break;
                case '3':
                    System.out.print("three");
                    break;
                case '4':
                    System.out.print("four");
                    break;
                case '5':
                    System.out.print("five");
                    break;
                case '6':
                    System.out.print("six");
                    break;
                case '7':
                    System.out.print("seven");
                    break;
                case '8':
                    System.out.print("eight");
                    break;
                case '9':
                    System.out.print("nine");
                    break;

            }

        }
    }
}
