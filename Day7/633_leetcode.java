package Day7;
class Solution {
    public boolean judgeSquareSum(int c)
    {
        int i=0;
        int j=(int)Math.sqrt(c);

        while(i<=j)
            {

                long sum=(long)i*i+(long)j*j;
                if(sum==c)
                    {
                        return true;
                    }
                else if(sum<c)
                    i++;
                else
                    j--;


            }
            return false;
    }
}