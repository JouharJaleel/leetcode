class Solution {
    public String largestGoodInteger(String num) {
        String maxGood = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            String sub = num.substring(i, i + 3);

            // Check if all 3 characters are same
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)) {
                if (maxGood.equals("") || sub.compareTo(maxGood) > 0) {
                    maxGood = sub;
                }
            }
        }

        return maxGood;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.largestGoodInteger("6777133339")); // "777"
        System.out.println(sol.largestGoodInteger("2300019"));    // "000"
        System.out.println(sol.largestGoodInteger("42352338"));   // ""
    }
}
