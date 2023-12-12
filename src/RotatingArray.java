public class RotatingArray {
    public static void main(String[] args) {
// rotating the array to the left by 1         
         int arr[] ={2,3,4,5,6,7,8,9};
         int temp = arr[0];
        for (int x:arr) {
            System.out.print(x+",");
        }
        System.out.println();
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for (int y:arr
             ) {
            System.out.print(y+",");
        }

    }
}
