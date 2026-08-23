class Solution {
    public int kadaneMax(int[] nums){
        int curr = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i],curr + nums[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
    public int kadaneMin(int[] nums){
        int curr = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.min(nums[i],curr + nums[i]);
            min = Math.min(min,curr);
        }
        return min;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int normalMax = kadaneMax(nums);
        if(normalMax < 0){
            return normalMax;
        }
        int total = 0;
        for(int num: nums){
            total += num;
        }
        int min = kadaneMin(nums);
        int circularMax = total - min;
        return Math.max(normalMax,circularMax);
    }
}