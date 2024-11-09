class Solution {
    
    public String convert(String s, int numRows) {

        if(s.length()<=numRows || numRows==1) return s;

        StringBuilder[] allCharRows = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++)
        {
            allCharRows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(char ch: s.toCharArray())
        {
            allCharRows[currentRow] = allCharRows[currentRow].append(ch);

            if(currentRow==0 || currentRow==numRows-1) goingDown = !goingDown;

            if(goingDown) currentRow += 1;
            else currentRow-=1;

        }

        StringBuilder ans = new StringBuilder();
        for(StringBuilder str: allCharRows)
        {
            ans.append(str);
        }

        return ans.toString();
    }
}
