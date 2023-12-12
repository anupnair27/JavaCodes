public class InfiniteArrayBinarySearch {
// Find an element in an array which is sorted but is infinite. (Cannot use arr.length)
public static void main(String args[]){
    int [] arr = {2,3,4,5,6,7,8,9,10,11,15,17,19,21,
    28,30,32,36,39,40,43}; // imagine this as an infinite array
    int target = 5;
    arraySearch(arr,target);

}
public static void arraySearch(int arr[], int target){
    int start = 0; int end = 1; ;
    while (target > arr[end]){
        int newstart = end +1;
        end = end + (end - start +1) * 2 ;
        start = newstart;

    }
    System.out.println(BinarySearch(arr,target,start,end));
}
public static int BinarySearch(int arr[], int target, int start , int end){
while (start <= end ){
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
}