public class BinarySearch {
    static int binarySearch(int arr[], int target ){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            // here the mid start and end is the position of the array,  not the actual value of the array
            int mid = start +(end - start) /2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid]> target) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr = {-10,-11, -9, -5, -4, 0,1 ,2, 3,4,5,6 };
        int target = -3;
        System.out.println(binarySearch(arr, target));
    }
}
