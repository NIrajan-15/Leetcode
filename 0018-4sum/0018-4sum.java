class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(target<0 && nums[0]>=0) return ans;
        for(int i=0;i<nums.length-3;i++){
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int first = nums[i];
        for(int j=i+1;j<nums.length-2;j++)
        {
            if (j > i+1 && nums[j] == nums[j - 1]) continue;
            int third = j+1;
            int fourth = nums.length-1;
            while(third<fourth)
            {
                int sum = first + nums[j] + nums[third] + nums[fourth];
                if(sum==target)
                {
                    ans.add(Arrays.asList(first, nums[j], nums[third],nums[fourth]));
                    third++;
                    fourth--;

                    while (third < fourth && nums[third] == nums[third - 1]) third++;
                    while (third < fourth && nums[fourth] == nums[fourth + 1]) fourth--;
                }
                else if(sum<target)
                {
                    third++;
                }
                else
                {
                    fourth--;
                }
            }
        }
        }
        return ans;
    }
}