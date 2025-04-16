/* Question 10 :- Generate all permutations of a given string. Write its algorithm, program. Find its time
and space complexities. Explain with suitable example.
 */

//Algorithm:
//1. Define a recursive function that takes two parameters: the string to permute and the current permutation (initially empty).
//2. If the string is empty, print the current permutation as one of the permutations.
//3. For each character in the string:
//   a. Select the character and remove it from the string.
//   b. Recursively call the function with the remaining string and the current permutation concatenated with the selected character.
//4. Repeat until all characters have been selected and the string is empty.
//5. The base case is when the string is empty, at which point the current permutation is printed.

public class question10 {
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        permute(str, "");
    }
}

//Time Complexity: O(n!) - The algorithm generates all permutations of the string, where n is the length of the string. The number of permutations of a string of length n is n! (n factorial).

//Space Complexity: O(n) - The algorithm uses a recursive stack space of O(n) for the depth of the recursion, where n is the length of the string.