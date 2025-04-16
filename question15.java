/* question 15: Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its
time and space complexities. Explain with suitable example.*/


// Algorithm
// 1. Let low = matrix[0][0] and high = matrix[n-1][n-1].

// 2. While low < high:

//      Find mid = (low + high) / 2.

//      Count how many elements in the matrix are <= mid.

//      If count < k: low = mid + 1

//      Else: high = mid

// 3. When loop ends, low is the answer.

public class KthSmallestInSortedMatrix {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Count of elements less than or equal to mid
    private static int countLessEqual(int[][] matrix, int mid) {
        int count = 0;
        int n = matrix.length;
        int row = n - 1, col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        int result = kthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}


// Time Complexity:
// O(n * log(max - min))

// log(max - min) for binary search

// O(n) for counting ≤ mid in each iteration


// Space Complexity:
// O(1) → Only variables used (no extra arrays or heaps)

