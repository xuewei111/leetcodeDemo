package main.java.com.移除元素;

public class main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},2));
    }

    public static int removeElement(int[] nums, int val) {
        int showIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[showIndex++] = nums[i];
            }
        }
        return showIndex;
    }
}
