public class Methods {
    static void change(int[] arr){
        arr[0] = 10;
    }


    public static void main(String args[]){
       int [] arr = {2,3,4,5};
       change(arr);
        for (int x:arr
             ) {
            System.out.println(x);
        }

    }
}
