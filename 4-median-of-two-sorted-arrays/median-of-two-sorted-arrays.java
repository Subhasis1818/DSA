class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        int z=0;
        int [] arr= new int[nums1.length+nums2.length];
        while(x<nums1.length && y<nums2.length){
            if(nums1[x]<=nums2[y]){
                arr[z++]=nums1[x++];
            }
            else{
                arr[z++]=nums2[y++];
            }
        }
        while(x<nums1.length){
            arr[z++]=nums1[x++];
        }
        while(y<nums2.length){
            arr[z++]=nums2[y++];
        }
        if(arr.length%2 !=0){
            int mid=(0+arr.length-1)/2;
            return arr[mid];
        }
        int mid=(0+arr.length-1)/2;
        return (double)(arr[mid]+arr[mid+1])/2;

    }
}