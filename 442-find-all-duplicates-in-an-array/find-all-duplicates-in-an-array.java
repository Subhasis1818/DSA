import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer k:map.keySet()){
            if(map.get(k)==2){
                list.add(k);
            }
        }
        return list;
    }
}