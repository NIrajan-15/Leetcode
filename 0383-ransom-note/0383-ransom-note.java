class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] letterArray = new int[26];
        
        if(ransomNote.length()>magazine.length()) return false;
        
        for(int i=0;i<magazine.length();i++)
        {
            letterArray[magazine.charAt(i)-'a'] += 1;
            if(i<ransomNote.length())
            {
                letterArray[ransomNote.charAt(i)-'a'] -= 1;
            }
        }
        
        for(int x: letterArray)
        {
            if(x<0) return false;
        }
        
        return true;
        
    }
}