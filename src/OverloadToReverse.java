public class OverloadToReverse {
   // reverse an integer
     static int reverse(int number){
        String temp =""; int reverse;
        while(number>0){
            reverse = number%10;
            temp = temp + Integer.toString(reverse);
            number/=10;
        }
        int parse = Integer.parseInt(temp);
        return parse;
    }

    // reverse an array
    static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            reverse[count]= arr[i];
            count++;
        }
        return reverse;

    }
    public static void main(String args[]){
        int number = 127;
        int[] arr = {2,3,4,5};
        int[] reverse = reverse(arr);
       // for (int i = 0; i < arr.length; i++){
      //      System.out.print(reverse[i]);
        //}
        System.out.println(reverse(number));
    }
}
