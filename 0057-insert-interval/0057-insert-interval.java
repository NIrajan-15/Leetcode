class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ansInterval = new ArrayList<>();
        for(int[] slot: intervals)
        {   
            if(newInterval[1]<slot[0])
            {
                ansInterval.add(newInterval);
                newInterval = slot;
            }
            else if(slot[1]<newInterval[0])
            {
                ansInterval.add(slot);
            }
            else
            {
                newInterval[0] = Math.min(newInterval[0],slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);
            }
            
        }
        ansInterval.add(newInterval);

        return ansInterval.toArray(new int[ansInterval.size()][]);
    }
}