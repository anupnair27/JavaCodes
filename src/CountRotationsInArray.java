public class CountRotationsInArray {
    public static void main(String args[]){
        int [] arr = {5,4,1,2,3};
        // the array here has been rotated 2 times.
        System.out.println(findRotation(arr));
    }
    static int findRotation(int[] arr){
        int start = 0; int end = arr.length-1;
        int count = 1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(mid < end && arr[mid]> arr[mid+1]){
                return count + mid;
            }else if(mid > start && arr[mid-1]> arr[mid]){
                return count + mid-1;
            }else if(arr[start]>= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return 0;
    }
}
