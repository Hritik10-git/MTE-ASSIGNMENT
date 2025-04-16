// question 18: Find the maximum XOR of two numbers in an array. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.

class TrieNode {
    TrieNode[] children = new TrieNode[2];
}

public class MaximumXOR {

    TrieNode root = new TrieNode();

    // Insert number into Trie
    private void insert(int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    // Find max XOR for a number
    private int findMaxXOR(int num) {
        TrieNode node = root;
        int maxXOR = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int opposite = 1 - bit;

            if (node.children[opposite] != null) {
                maxXOR |= (1 << i);
                node = node.children[opposite];
            } else {
                node = node.children[bit];
            }
        }
        return maxXOR;
    }

    public int findMaximumXOR(int[] nums) {
        for (int num : nums) {
            insert(num);
        }

        int maxResult = 0;
        for (int num : nums) {
            maxResult = Math.max(maxResult, findMaxXOR(num));
        }

        return maxResult;
    }

    public static void main(String[] args) {
        MaximumXOR obj = new MaximumXOR();
        int[] nums = {3, 10, 5, 25, 2, 8};
        int result = obj.findMaximumXOR(nums);
        System.out.println("Maximum XOR is: " + result);
    }
}

// Time Complexity:
// Insert into Trie: O(n * 32)

// XOR check for each number: O(n * 32)
// Total: O(n) (since 32 is constant)


// Space Complexity:
// Trie stores at most 32 * n nodes
// O(n) space