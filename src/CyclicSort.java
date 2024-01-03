import java.util.Arrays;

public class CyclicSort {

    // WHEN EVER GIVEN RANGE FROM 1 TO N ALWAYS REMEMBER CYCLIC SORT.
    public static void main(String args[]){
        int[] arr = {2,3,1,5,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

