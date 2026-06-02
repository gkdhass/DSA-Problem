HashMap<Integer>  num = new HashMap<>();
int n = nums.length;
Arrays.sort(nums);
for(int i=0; i<n-1; i++){
    if(nums[i] + nums[i+1] == tagret){
        num.put(nums[i] , nums[i+1])
    }
    return num;
}