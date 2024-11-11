class Solution {
    private List<List<Integer>> answer;
    public List<List<Integer>> subsets(int[] nums) {

        answer = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>());
        return answer;
    }

    private void backtrack(int[] nums, int index, List<Integer> currentList)
    {
        answer.add(new ArrayList<>(currentList));

        for(int i=index;i<nums.length;i++)
        {
            currentList.add(nums[i]);
            backtrack(nums, i+1, currentList);
            currentList.remove(currentList.size()-1);
        }
        
    }
}