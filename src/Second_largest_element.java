public class Second_largest_element {
    public static void main(String args[]){
// find the second largest element in an array;
        int[] arr = {2,3,4,6,7,8,10};
        int largest = Integer.MIN_VALUE; int target = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != largest && arr[i] > target){
                target = arr[i];
            }
        }
        System.out.println(target);
    }
}
