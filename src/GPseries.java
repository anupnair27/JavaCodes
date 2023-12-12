import java.util.Scanner;
public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter r");
        int r = sc.nextInt();
        System.out.println("enter d");
        int d = sc.nextInt();
        int sum = a;
        for (int i = 1; i <d ; i++) {
            System.out.print(sum+" ");
            sum = sum*r;
        }
    }
}
