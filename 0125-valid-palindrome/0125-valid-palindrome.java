class Solution {
    public boolean isPalindrome(String s) {
        
        int begin = 0;
        int end = s.length()-1;
        s = s.toLowerCase();

        while(begin<end)
        {
            char front = s.charAt(begin);
            char back = s.charAt(end);
            if(!Character.isLetterOrDigit(front))
            {
                begin++;
            }
            else if(!Character.isLetterOrDigit(back))
            {
                end--;
            }
            else
            {
                if(s.charAt(begin)!=s.charAt(end))
                {
                    return false;
                }
                begin++;
                end--;
            }
        }
        return true;
       
    }
}