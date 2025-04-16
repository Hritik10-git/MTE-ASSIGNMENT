// <--------------------------> Question 1 :- Explain the concept of a prefix sum array and its application -----------------------------> 

// A prefix sum array is a data structure that stores the cumulative sum of elements in an array up to each index. It is commonly used to optimize range sum queries and solve problems involving subarray sums efficiently.

// In a given array arr of size n, the prefix sum of this array is defined as:
//  arr[i] = arr[0] + arr[1] + arr[2] + ... + arr[n];
//It's Formula is as follows: arr[i] = arr[i-1] + arr[i];
// this means sum contains the sum of all elements in the array arr.

// Application of Prefix Sum Array:
// 1. Range Sum Queries : Quickly calculate the sum of elements in a subarray.
// 2. Subarray Problems : Solve problems like finding the maximum subarray sum, checking if a subarray has a given sum, etc.
// 3. Difference Arrays : Used in problems where you need to efficiently update ranges of an array.
// 4. 2D Prefix Sum : Extended to 2D arrays for solving range sum queries in matrices.

//Code Example: 

public class question1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = new int[arr.length];

        // Construct the prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Example: Find the sum of elements from index 1 to 3
        int l = 1, r = 3;
        int rangeSum = prefix[r] - prefix[l - 1];

        System.out.println("Sum of elements from index " + l + " to " + r + " is: " + rangeSum);
    }
}