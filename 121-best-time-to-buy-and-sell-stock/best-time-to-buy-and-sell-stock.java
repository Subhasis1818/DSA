class Solution {
    public int maxProfit(int[] arr) {
               int maxProfit=0;
       int bp=arr[0];
       for(int i=1;i<arr.length;i++){
            int sp=arr[i];
            if(sp>bp){
                int profit=sp-bp;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                bp=sp;
            }
       }
       return maxProfit;
    }
}