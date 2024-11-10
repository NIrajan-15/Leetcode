class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        helper(candidates, target, 0, test);
        return ans;
        
    }

    private void helper(int[] arr, int target, int start,  List<Integer> test)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(test));
            return;
        }
        if(target<0)
        {
            return;
        }

        for(int i=start;i<arr.length;i++)
        {
            test.add(arr[i]);
            helper(arr, target-arr[i], i, test);
            test.remove(test.size()-1);
        }
    }
}