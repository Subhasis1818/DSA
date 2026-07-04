class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int si=0;
        int ei=matrix.length-1;
        int val=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(matrix[mid][0]==target){
                val=mid;
                break;
            }
            else if(matrix[mid][0]>target){
                ei--;
            }
            else{
                si++;
            }

        }
        val=(si+ei)/2;
        si=0;
        ei=matrix[0].length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(matrix[val][mid]==target){
                return true;
            }
            else if(matrix[val][mid]>target){
                ei--;
            }
            else{
                si++;
            }

        }
        return false;

    }
}