class Solution {

    public String countAndSay(int n) {
        String encoded = "1";
        for(int i=2;i<=n;i++)
        {
            encoded = encode(encoded);

        }
        return encoded;
    }

    private String encode(String st)
    {
        StringBuilder result = new StringBuilder();
        
        char current = st.charAt(0);
        int count = 1;
       for(int i=1;i<st.length();i++)
       {
            if(st.charAt(i)!=current)
            {
                System.out.println(count+" "+current);
                result.append(count);
                result.append(current);
                current = st.charAt(i);
                count=1;
            }
            else
            {
                count++;
            }
       }
       System.out.println(count+" "+current);
       result.append(count);
       result.append(current);
       return result.toString();
    }
}
