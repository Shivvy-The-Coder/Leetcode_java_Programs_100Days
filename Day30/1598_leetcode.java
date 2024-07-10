package Day30;

class Solution {
    public int minOperations(String[] logs) 
    {
        int minstep=0;
        for (int i=0;i<logs.length;i++)
            {
                String s=logs[i];
            minstep = (s.charAt(1) == '.' && minstep != 0) ? minstep - 1 : (s.charAt(0) != '.') ? minstep + 1 : minstep;
            }
            return minstep;
    }
}