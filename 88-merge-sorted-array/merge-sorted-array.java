class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr= new int [m+n];
        int x=0;
        int y=0;
        int idx=0;
        while(x<m && y<n){
            if(nums1[x] <= nums2[y]){
                arr[idx++]=nums1[x++];
            }
            else if(nums1[x]>nums2[y]){
                arr[idx++]=nums2[y++];
            }
        }
        while(x<m){
            arr[idx++]=nums1[x++];
        }
        while(y<n){
            arr[idx++]=nums2[y++];
        }
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
    }
}