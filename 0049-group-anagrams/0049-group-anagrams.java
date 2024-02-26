class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] arr = new int[26];
            List<String> list = new ArrayList<>();
            for(int j=0;j<strs[i].length();j++)
            {
                arr[strs[i].charAt(j) - 'a']=arr[strs[i].charAt(j) - 'a']+1;
            }
            String str = Arrays.toString(arr);
            if(map.containsKey(str))
            {
                list = map.get(str);
            }
            list.add(strs[i]);
            map.put(str,list);
        }
        return new ArrayList<>(map.values());
    }
}