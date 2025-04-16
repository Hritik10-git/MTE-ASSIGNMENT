// Qestion 3 :- Solve the problem of finding the equilibrium index in an array. Write its algorithm, program. Find its time and space complexities. Explain with suitable example.


// In this Question we are going to find the equilibrium index of an array. The equilibrium index is the index where the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
// For example, in the array [2, 2, 0, 1, 3], the equilibrium index is 2 because the sum of elements at lower indexes (2 + 2) is equal to the sum of elements at higher indexes (1 + 3).

// The algorithm to find the equilibrium index is as follows:

// 1. Calculate the total sum of the array elements.(Prefix Sum Concept)
// 2. Initialize a variable leftSum to 0.
// 3. Iterate through the array and for each index i, calculate the right sum as total sum - leftSum - nums[i].
// 4. If leftSum is equal to rightSum, return the index i as the equilibrium index.
// 5. If not, update leftSum by adding nums[i] to it and continue to the next index.
// 6. If no equilibrium index is found, return -1.

//Example Code :
public class question3 {
    public static int pivotIndex(int[] nums) {
        int tSum=0;
        int leftSum=0;
        for(int i=0;i<= nums.length-1;i++){
            tSum+=nums[i];
        }
        for(int i=0;i<=nums.length-1;i++){
            int rightSum = tSum - leftSum - nums[i];
            if(leftSum==rightSum){
                return i;
            }else{
                leftSum = nums[i]+leftSum;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,0,1,3};
        System.err.println("Equilibrium index is: "+pivotIndex(nums));
    }
}

// Time Complexity: O(n), where n is the number of elements in the array. We are iterating through the array twice, once to calculate the total sum and once to find the equilibrium index.
//Space Complexity: O(1), as we are using only a constant amount of extra space for the leftSum and rightSum variables.