// question 22: How to check if a number is a power of two using bit manipulation. Write its algorithm,
// program. Find its time and space complexities. Explain with suitable example

public class PowerOfTwoChecker {

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 4, 8, 16, 18, 0, -2, 3};

        for (int num : testNumbers) {
            System.out.println(num + " is power of 2? " + isPowerOfTwo(num));
        }
    }
}

// Time Complexity:
// O(1) → Constant time bitwise operations

// Space Complexity:
// O(1) → No extra space used