class Solution {
    public String multiply(String num1, String num2) {

        int[] result = new int[num1.length()+num2.length()];
        int index = result.length-1;
        int carry = 0;
        for(int i=num1.length()-1;i>=0;i--)
        {
            carry = 0;
            int temp = index;
            for(int j=num2.length()-1;j>=0;j--)
            {
                int product = Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num2.charAt(j));
                product += carry;
                result[index] += product;
                int t = result[index];
                result[index] = t%10;
                carry = t/10;
                index--;
                
            }
            result[index] += carry;
            index=temp-1;;
        }
        StringBuilder sb = new StringBuilder();
        for(int num: result )
        {
            sb.append(num);
        }
        int count = 0;
        while(count<result.length&&result[count]==0)
        {
            count++;
        }
        if(count>=result.length) return "0";
        return sb.toString().substring(count);

    }
}
