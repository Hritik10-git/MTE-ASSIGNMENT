//Question 7 :- Explain the sliding window technique and its use in string problems.

//Sliding Wimdow Technique : The sliding window technique is a method for solving problems that involve finding a contiguous subarray or substring within a larger array or string. The idea is to maintain a "window" that represents the current subarray or substring being considered, and to slide this window across the array or string to explore all possible subarrays or substrings.

//Lets take an example of a string problem where we need to find longest substring without repeating characters.
//We have to  find the length of the longest substring without duplicate characters.

import java.util.ArrayList;
public class question7 {
    public static  int lengthOfLongestSubstring(String s) {
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
        String s ="abcabcbb";
        System.out.println("The length of longest substring :" + lengthOfLongestSubstring(s));
    }
}
