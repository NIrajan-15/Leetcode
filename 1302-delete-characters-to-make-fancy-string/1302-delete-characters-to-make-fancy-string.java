class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length()-2;i++)
        {
            if(arr[i+1]==arr[i]&&arr[i+2]==arr[i])
            {
                continue;
            }
            ans.append(arr[i]);
        }
        ans.append(s.substring(s.length()-2));
        return ans.toString();
    }
}