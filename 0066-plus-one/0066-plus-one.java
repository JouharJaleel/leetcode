class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment and return
                return digits;
            }
            digits[i] = 0; // Set to 0 and carry to next loop
        }

        // If all digits were 9, we need an extra leading 1
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    // Test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        printArray(sol.plusOne(new int[]{1,2,3})); // [1, 2, 4]
        printArray(sol.plusOne(new int[]{4,3,2,1})); // [4, 3, 2, 2]
        printArray(sol.plusOne(new int[]{9})); // [1, 0]
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
