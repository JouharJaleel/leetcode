class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first word as prefix
        String prefix = strs[0];

        // Compare prefix with each word
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce prefix length until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] strs1 = {"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs1)); // Output: fl

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(sol.longestCommonPrefix(strs2)); // Output: ""
    }
}
