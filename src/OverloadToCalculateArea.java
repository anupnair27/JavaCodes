public class OverloadToCalculateArea {
   static  int area(int l, int b){
       int rect = l*b;
       return rect;
   }
   static double area(int r){
       double circle = Math.PI*r*r;
       return circle;
   }
   public static void main(String args[]){
       int l = 10; int b = 10; int r = 15;
       System.out.println(area(r));
   }

}
