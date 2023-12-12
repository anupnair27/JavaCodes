public class ArraysPractice {
    public static void main(String args[]){
// find the sum of all the elements in an array;
        int [] arr = {2,3,4,5,6,7,8,9};
        int sum = 0; int count= arr.length-1;
//        while(count>=0){
//            sum = sum+ arr[count];
//            count--;
//        }
//        System.out.println(sum);

// finding the largest element in an array;
        int max = Integer.MIN_VALUE;
        while(count>=0){
            if (max < arr[count]) {
                max = arr[count];
            }
            count--;
            }
        System.out.println(max);
        //        }
    }
}
