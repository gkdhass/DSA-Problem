class Solution {
    public int majorityElement(int[] nums) {
        int sum = 0;
        int count = 0;

        for(int i : nums){
            if(count == 0){
                sum = i;
            }
            if(i == sum){
                count++;
            }
            else{
                count--;
            }
        }
        return sum;
    }
}