class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for(int i=0;i<gas.length;i++)
        {
            if(gas[i]<cost[i])
            {
                totalGas += gas[i];
                totalCost += cost[i];
            }

            if(gas[i]>=cost[i])
            {
                int newGas = 0;
                int newCost = 0;
                int j =i;
                while(j<gas.length)
                {
                    
                    newGas += gas[j];
                    newCost += cost[j];
                    j++;
                    if(newGas<newCost)
                    {
                        i=j-1;
                        totalGas += newGas;
                        totalCost += newCost;
                        j+=gas.length;
                    }
                }
                if((newGas+totalGas>=totalCost+newCost)) return i;
            }
        }
        return -1;
    }
}
