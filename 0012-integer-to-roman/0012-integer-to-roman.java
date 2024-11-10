class Solution {
    int nums;
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        nums = num;
        while(nums>=1)
        {
            if(nums>=1000)
            {
                ans.append(helper(0, new StringBuilder(), "", "", "", 1000, 'M'));
            }
            else if(nums>=100)
            {
                ans.append(helper(0, new StringBuilder(), "CD", "D", "CM", 100, 'C'));
            }
            else if(nums>=10)
            {
                ans.append(helper(0, new StringBuilder(), "XL", "L", "XC", 10, 'X'));
            }
            else
            {
                ans.append(helper(0, new StringBuilder(), "IV", "V", "IX", 1, 'I'));
            }
        }
        return ans.toString();

    }

    private StringBuilder helper(int count, StringBuilder current, String four, String five, String nine,  int base, char Num)
    {
        while(nums>=base)
        {
            count++;
            if(count==5)
            {
                current = new StringBuilder();
                current.append(five);
            }
            else
            {
                current.append(Num);
            }
            nums = nums - base;
        }
        if(count==4) return new StringBuilder(four);
        if(count==5) return new StringBuilder(five);
        if(count==9) return new StringBuilder(nine);
        return current;
    }
}