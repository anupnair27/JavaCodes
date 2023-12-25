import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1; // -1 because we don't need to check the sorted elements int the array again.
            int maxIndex = getMax(arr,0,last);
            // now swapping the element;
            int temp  = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    // function to find the index of the maximum element in the array.
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
