class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int a = nums[i];
            int start = i+1;
            int end = nums.length-1;

            if(i>0 && a==nums[i-1]) continue;        

            while(start<end)
            {
                int sum = nums[start]+nums[end]+a;
                if(sum<0) start++;
                
                else if(sum>0) end--;

                else
                {
                    list.add(new ArrayList<>(Arrays.asList(a, nums[start], nums[end])));
                    start+=1;
                    while(nums[start]==nums[start-1]&& start<end)
                    {
                        start+=1;
                    }
                }
            }
        }
        return list;
    }

    
}
//[-4,-1,-1,0,1,2]