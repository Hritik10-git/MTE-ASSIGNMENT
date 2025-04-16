// question 20:  Count all numbers with unique digits for a given number of digits. Write its algorithm,
// program. Find its time and space complexities. Explain with suitable example

public class UniqueDigitNumbers {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; // Max 10 unique digits (0-9)

        int total = 10; // For n = 1
        int uniqueDigits = 9;
        int available = 9;

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= available;
            total += uniqueDigits;
            available--;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 3;
        int result = countNumbersWithUniqueDigits(n);
        System.out.println("Total numbers with unique digits (n = " + n + ") = " + result);
    }
}

// Time Complexity
// O(n) → Single loop up to n (max 10)

// Space Complexity
// O(1) → Constant space used