class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        boolean isNegative = false;
        int begin = 0;
        s = s.trim();
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-')
        {
            isNegative=true;
            begin++;
        }
        if(s.charAt(0)=='+')
        {
            begin++;
        }

        long ans = 0;
        while(begin<s.length() && Character.isDigit(s.charAt(begin)))
        {
            ans = ans*10+(s.charAt(begin)-'0');
            if(isNegative && -ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(!isNegative && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            begin++;
        }
        
        if(isNegative) return (int) -ans;
        return (int) ans;
    }
}