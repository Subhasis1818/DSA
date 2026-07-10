import java.util.*;
class Solution {
    public String sortSentence(String s) {
       //Write your code here
       String [] arr= s.split(" ");
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j].charAt(arr[j].length()-1)>arr[j+1].charAt(arr[j+1].length()-1)){
                String temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
       }
       String str="";
       for(int i=0;i<arr.length;i++){
        str+=arr[i].substring(0,arr[i].length()-1)+" ";
       }
       return str.strip();
    }
}
