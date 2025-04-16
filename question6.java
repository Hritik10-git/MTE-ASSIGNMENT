/*  Questioon 6 :- Find the length of the longest substring without repeating characters. Write its
algorithm, program. Find its time and space complexities. Explain with suitable
example. */

//In this question we have to return the lengthof the logest non repeating substring in a given string .

//Algorithm:
//1. Create an empty list to store the characters substring.
//2. Initialize a variable maxi to 0 to keep track of the maximum length of the substring.
//3. Iterate through each character in the string.
//4. For each character, check if it is already present in the list.
//5. If it is present, remove characters from the start of the list until the current character can be added.
//6. Add the current character to the list.
//7. Update the maxi variable with the maximum length of the substring found so far.
//8. Return the value of maxi as the length of the longest substring without repeating characters.


import java.util.ArrayList;

public class question6 {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> res = new ArrayList<>();
        int maxi = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (res.contains(ch)) {
                res.remove(0);
            }

            res.add(ch);
            maxi = Math.max(maxi, res.size());
        }

        return maxi;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("Length of the Substring: "+ lengthOfLongestSubstring(s));
    }
}

//Time Complexity: O(n), where n is the length of the input string. This is because we are iterating through the string once and performing constant time operations for each character.

//Space Complexity: O(n), where n is the length of the input string. 