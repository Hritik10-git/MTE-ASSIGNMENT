// question 21: How to count the number of 1s in the binary representation of numbers from 0 to n.
// Write its algorithm, program. Find its time and space complexities. Explain with
// suitable example.

public class CountBits {

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);

        System.out.println("Count of 1s from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " -> " + result[i]);
        }
    }
}

// Time Complexity:
// O(n) → One pass from 1 to n

// Space Complexity:
// O(n) → For storing the result array