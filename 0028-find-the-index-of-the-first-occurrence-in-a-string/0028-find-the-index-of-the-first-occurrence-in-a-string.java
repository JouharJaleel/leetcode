class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        // Edge case: if needle is longer than haystack
        if (n > m) return -1;

        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;  // Found first occurrence
            }
        }
        return -1; // Not found
    }
}
