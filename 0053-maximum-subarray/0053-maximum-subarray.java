class Solution {
    public int maxSubArray(int[] nums) {
        int n = 0;
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            n += i;
            if(n > max){
                max = n;
            }
            if(n < 0){
                n = 0;
            }
        }
        return max;
    }
}