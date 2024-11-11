class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] arr = new int[difficulty.length][2];
        for(int i=0;i<difficulty.length;i++)
        {
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        Arrays.sort(worker);

        if(worker[worker.length-1]<arr[1][0]) return 0;
        int arrIndex = 0;
        int sum = 0;
        int max = 0;
        for(int i=0;i<worker.length;i++)
        {
            while(arrIndex<arr.length && worker[i]>=arr[arrIndex][0])
            {
                max = Math.max(arr[arrIndex][1], max);
                arrIndex++;
            }
            
            sum += max;
            System.out.println(worker[i]+" "+sum);
        }
        return sum;
    }
}



