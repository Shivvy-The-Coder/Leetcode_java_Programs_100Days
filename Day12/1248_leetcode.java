package Day12;

class Solution {
    public int numberOfSubarrays(int[] nums, int k)
    {
        return (count_niceSubArray(nums,k)-count_niceSubArray(nums,k-1));
    }
    public int count_niceSubArray(int[] nums, int k)
        {

            int ei=0,si=0,j=0;
        int count=0;
        while(ei<nums.length)
            {
                // grow
                if(nums[ei]%2!=0)
                    j++;
                // shrink
                while(j>k)
                    {
                        if(nums[si]%2==1)
                            {
                                j--;
                            }
                        si++;                       
                    }
                // update
                ei++;
                count+=(ei-si+1);
            }    
            return count;
        }
}