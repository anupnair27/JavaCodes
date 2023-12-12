public class SimplifiedGCD {
    static int gcd(int num1, int num2){
        while(num1!=num2){
            if(num1>num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String args[]){
        int num1 = 35; int num2 = 56;
        System.out.println(gcd(num1, num2));

    }
}
