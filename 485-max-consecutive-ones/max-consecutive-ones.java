class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        int idx=0;
        while(idx<nums.length){
            if(nums[idx]==1){
                count =0;
                while(idx<nums.length && nums[idx] != 0){
                    idx++;
                    count++;
                }
                
                max=Math.max(max,count);
            }
            else{
                idx++;
            }
        }
        
        return max;
    }
}