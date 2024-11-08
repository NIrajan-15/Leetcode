class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for(int num: nums)
        {
            numCount.put(num, numCount.getOrDefault(num, 0)+1);
        }
        int start = 0;
        int currentCount = 0;
        for(int num: numCount.keySet())
        {
            currentCount += numCount.get(num);
            for(int j=start;j<currentCount;j++)
            {
                nums[j] = num;
            }
            start = currentCount;
        }
        
    }
}