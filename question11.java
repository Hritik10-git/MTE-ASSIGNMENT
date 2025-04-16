/* Question 11 :-  Find two numbers in a sorted array that add up to a target. Write its algorithm, program.
Find its time and space complexities. Explain with suitable example. */

//Algorithm: 
//1. Initialize two pointers, left (l) at the start of the array and right (r) at the end of the array.
//2. While left pointer is less than right pointer:
//   a. Calculate the sum of the elements at the left and right pointers.
//   b. If the sum is equal to the target, return the elements at the left and right pointers as the result.
//   c. If the sum is greater than the target, decrement the right pointer to reduce the sum.
//   d. If the sum is less than the target, increment the left pointer to increase the sum.
//3. If no such pair is found, return an indication that no solution exists.

public class question11 {
    public static int[] twoSum(int[] numbers, int target) {
        int [] res =new int[2];
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target) {
                res[0]=numbers[l];
                res[1]=numbers[r];
                break;
            }
            else if(sum>target){
                r--;
            }else l++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
    
        int[] result = twoSum(arr, target);
        System.out.println("Numbers which add upto target are: "+result[0] + " and " + result[1]);
    }
}

//Time Complexity: O(n) - The algorithm iterates through the array once, where n is the number of elements in the array.
//Space Complexity: O(1) - The algorithm uses a constant amount of space for the pointers and the result array.