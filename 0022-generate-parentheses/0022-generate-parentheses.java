class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        ans  = new ArrayList<>();
        backtrack(n, 0, 0, "");
        return ans;
    }

    private void backtrack(int n,int countA,int countB, String current)
    {
        if(current.length()==n*2)
        {
            ans.add(current);
            return;
        }

        if(countA<n)
        {
            backtrack(n, countA+1, countB, current+'(');
        }

        if(countB<countA)
        {
            backtrack(n, countA, countB+1, current+')');
        }
    }
}

