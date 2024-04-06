import java.util.*;

public class minMax {
    static int min(int[] nums) {
        int minNum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            } 
        }

        return minNum; 
    }

    static int max(int[] nums) {
        int maxNum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            } 
        }

        return maxNum;  
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Input Array: " + Arrays.toString(nums));

        System.out.println("Minimum: " + min(nums));
        System.out.println("Maximum: " + max(nums));
    }
}
