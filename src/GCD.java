public class GCD {
    static int max(int num1, int num2){
        if(num1> num2){
            return num1;
        }else{
            return num2;
        }
    }
    static void gcd(int num1, int num2){
        int gcd = 1; int max = max(num1,num2);
        for (int i = 1; i <max ; i++) {
            if(num1%i == 0 && num2%i == 0){
                if(i>gcd){
                    gcd = i;
                }
            }
        }
        System.out.println("GCD of "+ num1+" and "+num2+" is "+gcd);

    }
    public static void main(String args[]){
        int num1 = 35; int num2= 56;
        gcd(num1,num2);
    }
}
