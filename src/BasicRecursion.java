public class BasicRecursion {
    public static void main(String args[]){
        int n = 5;
        function(n);
        newFunction(n);
    }
    public static void function(int n){
        if(n>0){
            System.out.println(n);
            function(n-1);
        }
    }

    public static void newFunction(int n){
        if(n>0){
            newFunction(n-1);
            System.out.println(n);
        }
    }
}
