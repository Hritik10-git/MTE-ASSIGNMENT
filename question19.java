// question 19: How to find the maximum product subarray. Write its algorithm, program. Find its time
// and space complexities. Explain with suitable example.

public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                // Swap currentMax and currentMin
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum Product Subarray = " + result);
    }
}

// Time Complexity:
// O(n) → Single pass through the array

// Space Complexity:
// O(1) → Constant space used (just variables)