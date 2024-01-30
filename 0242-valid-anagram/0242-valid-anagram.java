class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++)
        {
            int sCharPosition = s.charAt(i) - 'a';
            int tCharPosition = t.charAt(i) - 'a';
            arr[sCharPosition] += 1;
            arr[tCharPosition] -= 1;
        }

        for(int x: arr)
        {
            if(x!=0) return false;
        }

        return true;

        
    }
}