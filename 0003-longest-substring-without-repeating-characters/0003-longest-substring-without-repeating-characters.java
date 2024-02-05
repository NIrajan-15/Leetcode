class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> charSet = new HashSet<>();
        if(s.length()<=0) return 0;
        while(end<s.length())
        {
            if(charSet.add(s.charAt(end)))
            {
                max = Math.max(max,end-begin);
                end++;
                
            }
            else
            {
                charSet.remove(s.charAt(begin));
                begin++;
            }
        }
        return max+1;
    }
}