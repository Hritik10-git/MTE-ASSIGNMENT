// question 17: Calculate how much water can be trapped between the bars of a histogram. Write its
// algorithm, program. Find its time and space complexities. Explain with suitable
// example.

// Algorithm (Two Pointer Approach — Optimal):

// 1. Initialize:

//         left = 0, right = n-1

//         leftMax = 0, rightMax = 0

//         water = 0


// 2. While left < right:

//         If height[left] < height[right]:

//         If height[left] >= leftMax: update leftMax

//         Else, water += leftMax - height[left]

//         Move left++

//         Else:

//         If height[right] >= rightMax: update rightMax

//         Else, water += rightMax - height[right]

//         Move right--


// 3. Return total water

public class TrappingRainWater {

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] elevation = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(elevation);
        System.out.println("Water trapped: " + result + " units");
    }
}


//  Time Complexity:
// O(n) — Single pass through the array

// Space Complexity:
// O(1) — Only a few variables used
