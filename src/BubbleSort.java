import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int [] arr = {1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        // run the loop till n-1 times
        boolean swapped = false; // this is if the array is already sorted to begin with;
        for (int i = 0; i < arr.length ; i++) {
            // run the second loop n-i times
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true; // if swap occurs even once that means the array was sorted to begin with. Hence, change the boolean value.
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
