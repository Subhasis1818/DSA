class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=revArr(arr[i]);
        }
        for(int  i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
    static int [] revArr(int [] arr){
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