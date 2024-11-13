class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int i=0;

        while(i<arr1.length&&i<arr2.length)
        {
            int num1 = Integer.parseInt(arr1[i]);
            int num2 = Integer.parseInt(arr2[i]);
            if(num1<num2) return -1;
            if(num2<num1) return 1;
            i++;
        }
        if(i>=arr1.length&&i>=arr2.length) return 0;
        if(i>=arr1.length)
        {
            while(i<arr2.length)
            {
                if(Integer.parseInt(arr2[i])>0) return -1;
                i++;
            }
        } 
        if(i>=arr2.length)
        {
            while(i<arr1.length)
            {
                if(Integer.parseInt(arr1[i])>0) return 1;
                i++;
            }
        }
        return 0;
    }
}