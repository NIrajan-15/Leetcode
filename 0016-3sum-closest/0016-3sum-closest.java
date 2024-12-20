class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int j =i+1;
            int k = nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                if(Math.abs(closest-target)>Math.abs(sum-target))
                {
                    closest = sum;
                }
                
                if(sum>target) k--;
                else j++;
            }
        }
        return closest;
        
    }
}
