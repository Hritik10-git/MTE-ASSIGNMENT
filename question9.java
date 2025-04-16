/* Question 9 :-  Find the longest common prefix among a list of strings. Write its algorithm, program.
Find its time and space complexities. Explain with suitable example */

//Algorithm:
//1. Initialize a variable prefix to the first string in the array of strings.
//2. Iterate through the remaining strings in the array, starting from the second string.
//3. For each string, check if it starts with the current prefix.
//4. If it does not, reduce the prefix by removing the last character until it matches the start of the current string.
//5. Continue this process until all strings have been checked or the prefix becomes empty.
//6. Return the final prefix as the longest common prefix among the strings.
//7. If no common prefix is found, return an empty string.

public class question9 {
    public static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
       for(int index=1;index<strs.length;index++){
           while(strs[index].indexOf(prefix) != 0){
               prefix=prefix.substring(0,prefix.length()-1);
           }
       }
       return prefix;
   }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));
    }
}

//Time Complexity: O(n*m), where n is the number of strings and m is the length of the longest string.

//Space Complexity: O(1), as we are using a constant amount of space to store the prefix variable.