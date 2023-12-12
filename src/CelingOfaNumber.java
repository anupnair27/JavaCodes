public class CelingOfaNumber {

    public static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start<= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid]== target) {
                return mid;
            }
        }
        return arr[start];

    }

    public static void main(String args[]){
        int [] arr = {2,3,5,6,8,9,10,14,16};
        int target = 13;
        System.out.println(celing(arr, target));
    }
}
