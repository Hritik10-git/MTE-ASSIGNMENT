/*  Question 2 :- Write a program to find the sum of elements in a given range [L, R] using a prefix sum
array. Write its algorithm, program. Find its time and space complexities. Explain with
suitable example. */


// Algorithm:
// 1. Create a prefix sum array where each element at index i stores the sum of elements from the start of the array to index i.
// 2. To find the sum of elements in the range [L, R], use the formula:
//    sum = prefix[R] - prefix[L-1] (if L > 0), otherwise sum = prefix[R].
// 3. Return the calculated sum.

// Time Complexity: O(n) for building the prefix sum array, O(1) for each range query.
// Space Complexity: O(n) for the prefix sum array.

import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Enter the range L and R (0-based index): ");
        int L = sc.nextInt();
        int R = sc.nextInt();

        // Calculate sum in range [L, R]
        int sum;
        if (L > 0) {
            sum = prefix[R] - prefix[L - 1];
        } else {
            sum = prefix[R];
        }

        // Output the result
        System.out.println("The sum of elements in the range [" + L + ", " + R + "] is: " + sum);

        sc.close();
    }
}