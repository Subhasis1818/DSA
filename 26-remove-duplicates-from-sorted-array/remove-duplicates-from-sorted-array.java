class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int idx=0;
        int count=0;
        for(int x:set){
            nums[idx++]=x;
            count++;
        }
        return count;
    }
}