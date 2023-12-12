public class OrderAgnosticBinarySearch {
    static int aecBinarySearch(int arr[], int target){
        int start = 0; int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start) /2;
            if(arr[mid] > target){
                end  = mid -1; // left hand side
            }else if (arr[mid]< target){
                start = mid +1; // right hand side
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    static int decBinarySearch(int arr[], int target){
        int start = 0; int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start) /2;
            if(arr[mid] > target){
                start = mid +1; // right hand side
            }else if (arr[mid]< target){
                end  = mid -1; // left hand side
            }else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    static void checkArray(int [] arr, int target){
        if(arr[0]<arr[arr.length-1]){
            System.out.println(aecBinarySearch(arr, target));
        } else if (arr[0]>arr[arr.length-1]) {
            System.out.println(decBinarySearch(arr, target));
        }else{
            System.out.println("the array contains the same element in every position");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,5,5,5,5,5};
        int target = 35;
        checkArray(arr,target);
    }
}
