class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=revArr(arr[i]);
        }
    }
    static int[] revArr(int [] arr){
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
        return arr;
    }
}