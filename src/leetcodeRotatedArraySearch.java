public class leetcodeRotatedArraySearch {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums,target));

    }

        public static int search(int[] nums, int target) {
            int pivot = isPeak(nums);
            if (pivot == -1) {
                return BS(nums, target, 0, nums.length - 1);
            } else if (nums[pivot] == target) {
                return pivot;
            } else if (nums[0] <= target) {
                return BS(nums, target, 0, pivot - 1);
            } else {
                return BS(nums, target, pivot + 1, nums.length - 1);
            }
        }

        public static int isPeak(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (mid > start && nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                } else if (nums[mid] < nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        public static int BS(int[] nums, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }