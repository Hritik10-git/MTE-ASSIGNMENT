/* Question 12:- Rearrange numbers into the lexicographically next greater permutation. Write its
algorithm, program. Find its time and space complexities. Explain with suitable
example.
 */

//Algorithm:
//1. Start from the end of the array and find the first pair of adjacent elements (i, i+1) such that nums[i] < nums[i+1].
//2. If no such pair is found, reverse the entire array to get the smallest permutation.
//3. Otherwise, find the smallest element in the suffix (i.e., the part of the array after index i) that is greater than nums[i].
//4. Swap this element with nums[i].
//5. Reverse the suffix to get the next permutation.
//6. Return the modified array.

public class question12 {
    private static void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            reverse(nums,0,n-1);
            return;
        }
        for(int i =n-1; i>=idx; i--){
            if(nums[i]>nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
        for(int num : nums){
            System.out.print(num+" ");;
        }
    }
}

//Time Complexity: O(n) - The algorithm iterates through the array a constant number of times.
//Space Complexity: O(1) - The algorithm uses a constant amount of space for the pointers and temporary variables.