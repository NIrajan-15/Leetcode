class Solution {
    public String addBinary(String a, String b) {
        int aPointer = a.length()-1;
        int bPointer= b.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(aPointer>=0||bPointer>=0||carry==1)
        {
            if(aPointer>=0)
            {
                carry += a.charAt(aPointer)-'0';
                aPointer--;
            }
            if(bPointer>=0)
            {
                carry += b.charAt(bPointer)-'0';
                bPointer--;
            }
            result.append(Integer.toString(carry%2));
            carry = carry/2;
            
        }
        return result.reverse().toString();
    }
}