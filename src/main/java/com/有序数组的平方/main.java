package main.java.com.有序数组的平方;

public class main {

    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    private static int[] sortedSquares (int [] nums) {
        // 结果集
        int [] result = new int[nums.length];

        int i = 0,j = nums.length - 1;
        for (int k = nums.length -1; i <= j; k--) {
            if(nums[i] * nums[i] < nums[j] * nums[j]) {
                result[k] = nums[j] * nums[j];
                --j;
            } else {
                result[k] = nums[i] * nums[i];
                ++i;
            }
        }
        return result;
    }
}
