class Solution {
    StringBuilder ans = new StringBuilder();
    public String intToRoman(int num) {
        int count = 0;
        StringBuilder current = new StringBuilder();
        while(num>=1000)
        {
            current.append("M");
            num = num-1000;
            
        }
        ans.append(current);
        current= new StringBuilder();
        while(num>=100)
        {
            count++;
            if(count==5)
            {
                current = new StringBuilder();
                current.append("D");
            }
            else
            {
                current.append('C');
            }
            
            num = num - 100;
        }
        if(count==4) ans.append("CD");
        else if(count==9) ans.append("CM");
        else if(count==5) ans.append("D");
        else ans.append(current);
        current = new StringBuilder();
        count=0;
        while(num>=10)
        {
            count++;
            if(count==5)
            {
                current = new StringBuilder();
                current.append("L");
            }
            else
            {
                current.append("X");
            }
            num = num - 10;
        }
        if(count==4) ans.append("XL");
        else if(count==9) ans.append("XC");
        else if(count==5) ans.append("L");
        else ans.append(current);
        current = new StringBuilder();
        count = 0;
        while(num>=1)
        {
            count++;
            if(count==5)
            {
                current = new StringBuilder();
                current.append("V");
            }
            else
            {
                current.append("I");
            }
            num = num - 1;
        }
        if(count==4) ans.append("IV");
        else if(count==9) ans.append("IX");
        else if(count==5) ans.append("V");
        else ans.append(current);

        return ans.toString();

    }
}