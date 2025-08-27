class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            // If character already seen, move left pointer
            if (map.containsKey(c)) {
                // move left to the right of previous occurrence
                left = Math.max(left, map.get(c) + 1);
            }

            // Update character's latest index
            map.put(c, right);

            // Calculate window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
