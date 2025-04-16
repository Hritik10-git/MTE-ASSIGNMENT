/* Question 8 :- Find the longest palindromic substring in a given string. Write its algorithm, program.
Find its time and space complexities. Explain with suitable example */ 

// Algorithm : 
//1. Initialize a variable maxLen to 1 to keep track of the length of the longest palindromic substring found so far.
//2. Initialize a variable maxStr to the first character of the input string to store the longest palindromic substring found so far.
//3. Iterate through the string using two nested loops. The outer loop iterates through each character in the string, and the inner loop iterates through all possible substrings starting from the current character.
//4. For each substring, check if it is a palindrome by calling the isPalindrome function.
//5. If the substring is a palindrome and its length is greater than maxLen, update maxLen and maxStr with the new values.
//6. After iterating through all possible substrings, return maxStr as the longest palindromic substring found in the input string.
//7. The isPalindrome function checks if a given string is a palindrome by comparing characters from both ends of the string until the middle is reached.
//8. If all characters match, the function returns true, indicating that the string is a palindrome. Otherwise, it returns false.


public class question8 {
    public static String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int maxLen =1;
        String maxStr = s.substring(0,1);
        for(int i=0;i<s.length() ;i++){
            for(int j =i;j<=s.length();j++){
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){
                    maxLen = j-i;
                    maxStr = s.substring(i,j);
                }
            }
        }
        return maxStr;
    }
    private static boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String  s= "babad";
        System.out.println("The longest palindromic substring is: " + longestPalindrome(s));
    }
}

//Time Complexity: O(n^3), where n is the length of the input string.
//Space Complexity: O(1), as we are using a constant amount of space to store the variables maxLen and maxStr.