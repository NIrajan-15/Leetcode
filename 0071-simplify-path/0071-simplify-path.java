class Solution {
    public String simplifyPath(String path) {
        String[] dirs = (path.substring(1, path.length())).split("/");
        Stack<String> stk = new Stack<>();
        StringBuilder finalResult = new StringBuilder();
        for(String dir: dirs)
        {
            if(dir.equals("")||dir.equals(".")) continue;
            else if(dir.equals(".."))
            {
                if(!stk.isEmpty()) stk.pop();
            }
            else
            {
                stk.push(dir);
            }
        }
        Stack<String> temp = new Stack<>();
        while(!stk.isEmpty())
        {
            temp.push(stk.pop());
        }
        while(!temp.isEmpty())
        {
            finalResult.append("/"+temp.pop());
        }
        if(finalResult.toString().equals("")) return "/";
        return finalResult.toString();
    }
}