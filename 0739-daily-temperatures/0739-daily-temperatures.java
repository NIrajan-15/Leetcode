class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
            for(int i=0;i<ans.length-1;i++)
            {
                if(i>0 && temperatures[i]==temperatures[i-1])
                {
                    if(ans[i-1]!=0){
                        ans[i] = ans[i-1]-1;
                    }else
                    {
                        ans[i] = 0;
                    }
                    continue;
                }
                else if(temperatures[i]<temperatures[i+1])
                {
                    ans[i] = 1;
                }
                else
                {
                int j=i+1;
                while(j<ans.length&&temperatures[j]<=temperatures[i])
                {
                    j++;
                }
                if(j>=ans.length) ans[i]=0;
                else ans[i] = j-i;
                }
            }
            return ans;
        }
}
