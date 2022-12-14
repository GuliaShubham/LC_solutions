class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
            HashMap<String,List<String>> map = new HashMap<>();
            for(String s :str){
                char [] arr= s.toCharArray();
                Arrays.sort(arr);
                String snew = String.valueOf(arr);
                if(map.containsKey(snew)){
                    List<String> sl = map.get(snew);
                    sl.add(s);
                    map.put(snew,sl);
                }
                else{
                    List<String> sl = new ArrayList<>();
                    sl.add(s);
                    map.put(snew,sl);
                }
            }
            List<List<String>> ans = new ArrayList<>();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        
                   List<String> v = entry.getValue();
                   ans.add(v);
             }
        return ans;
    }
}
