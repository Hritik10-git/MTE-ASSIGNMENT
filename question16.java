/* question 16: Find the majority element in an array that appears more than n/2 times. Write its
algorithm, program. Find its time and space complexities. Explain with suitable
example. */

// Algorithm:

// 1. Initialize: 

//         candidate = null

//         count = 0

// 2. Traverse the array:

//         If count == 0, assign candidate = current_element

//         If candidate == current_element, increment count

//         Else, decrement count

// 3. Return the candidate (it is guaranteed to be the majority)

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajorityElement(arr);
        System.out.println("Majority Element: " + result);
    }
}


// Time Complexity:
// O(n) → Single pass through the array



// Space Complexity:
// O(1) → Constant space