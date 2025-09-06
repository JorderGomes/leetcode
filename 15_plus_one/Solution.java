class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int plus = 1;
        while (plus != 0){
            if(i < 0){
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = plus;
                System.arraycopy(digits, 0, newDigits, 1, digits.length);
                return newDigits;
            }
            int sum = digits[i] + plus;
            if (sum >= 10){
                digits[i] = sum % 10;
                plus = sum / 10;
            } else {
                digits[i] = sum;
                plus = 0;
            }
            i--;
        }
        return digits;
    }

    public void callPlusOne(){
        int[] digits = {9,9};
        int[] result = plusOne(digits);
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.callPlusOne();
    }
}