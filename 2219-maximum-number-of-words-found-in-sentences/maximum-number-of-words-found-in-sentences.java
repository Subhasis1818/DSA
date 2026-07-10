class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            String [] arr=sentences[i].split(" ");
            count=Math.max(arr.length,count);
        }
        return count;
    }
}