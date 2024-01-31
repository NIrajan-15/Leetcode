class Solution {
    public int longestPalindrome(String s) {
        int[] char_array = new int[128];
        int result = 0;
        for(char c: s.toCharArray())
        {
            char_array[c]++;
        }
        
        for(int x: char_array)
        {
            result += (x/2)*2;
            if(result%2==0 && x%2!=0)
            {
                result += 1;
            }
        }
        return result;
    }
}