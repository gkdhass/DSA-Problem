class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] n = new int[len * 2];
        for(int i=0; i<len; i++){
            n[i] = nums[i];
            n[i+len] = nums[i];
        }
        return n;
    }
}