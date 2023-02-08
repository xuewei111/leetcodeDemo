package main.java.com.二分查找;

public class main {


    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,7,9,10},7));
    }


    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public static int search(int [] nums,int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == target) return i;
//        }
//        return -1;

        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle -1;
            }
        }
        return -1;
    }
}


