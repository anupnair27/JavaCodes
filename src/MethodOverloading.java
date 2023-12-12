public class MethodOverloading {
    /*
    method overloading is used when we want to use the same
    method name but uses different parameters which can be
    a change in datatype(int, float) or change in number of arguments passed
    (int a, int b or int a, int b, int c)
     */
    static int max(int a, int b){
        return a>b?a:b;
    }
    static int max(int a, int b, int c){
        return a>b && a>c ? a:b>c && b>a ? b:c;
    }
    static float max(float a , float b){
        return a>b?a:b;
    }
    public static void main(String args[]){

        int a = 1000; int b =15;int c = 20;
        float d = 10f; float e = 10.2f;
        System.out.println(max(d,e));;

    }
}
