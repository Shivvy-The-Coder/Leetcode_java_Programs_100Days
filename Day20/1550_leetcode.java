package Day20;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr)
    {
        int ei=0,count=0;
        while(ei<arr.length)
            {
                // grow
                if(arr[ei]%2!=0)
                    count++;
                else
                    count=0;
                // shrink
                if (count==3)
                    return true;
                // update
                ei++;           
            }
            return false;

    }
}