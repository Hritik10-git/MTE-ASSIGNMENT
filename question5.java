/* Question 5 :- Find the maximum sum of any subarray of size K in a given array. Write its algorithm,
program. Find its time and space complexities. Explain with suitable example*/

//In this question we are going to find the maximum sum of any subarray of size K in a given array. The algorithm to find the maximum sum of any subarray of size K is as follows: 

//Algorithm: 
// 1. Initialize a variable currSum to 0 and maxSum to 0.
// 2. Calculate the sum of the first K elements and store it in currSum.
// 3. Set maxSum to currSum.
// 4. Iterate through the array from index K to the end of the array.
// 5. For each index i, add the current element to currSum and subtract the element at index i-K from currSum.
// 6. Update maxSum if currSum is greater than maxSum.
// 7. Return maxSum as the result.

//Example Code: 

public class question5 {
    public static int maximumSumSubarray(int[] arr, int k) {
        int currSum=0;
        int maxSum =0;
        for(int i=0;i<=k-1;i++){
            currSum+=arr[i];
        }
        maxSum = currSum;
        for(int i=k;i<arr.length;i++){
            currSum+=arr[i];
            currSum = currSum - arr[i-k];
            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k=3;
        System.out.println("Maximum sum of subarray : "+maximumSumSubarray(arr,k));
    }
}

//Time Complexity: O(n), where n is the number of elements in the array. We are iterating through the array once to calculate the maximum sum of any subarray of size K.

//Space Complexity: O(1), as we are using only a constant amount of extra space for the currSum and maxSum variables.