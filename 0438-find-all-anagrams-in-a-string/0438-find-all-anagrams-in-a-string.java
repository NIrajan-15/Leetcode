class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pArr = new int[26];
        List<Integer> ans = new ArrayList<>();
        
        for(char ch: p.toCharArray())
        {
            pArr[ch-'a'] += 1;
        }
        String pStr = Arrays.toString(pArr);
        for(int i=0;i<=s.length()-p.length();i++)
        {
            if(pArr[s.charAt(i)-'a']>0)
            {
                int[] current = new int[26];
                for(char ch: s.substring(i, i+p.length()).toCharArray())
                {
                    current[ch-'a'] += 1;
                }
                
                if(Arrays.toString(current).equals(pStr)) ans.add(i);
            }
        }
        return ans;
    }
}