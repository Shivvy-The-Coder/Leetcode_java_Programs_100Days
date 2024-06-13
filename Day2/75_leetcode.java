package Day2;
class Solution
 {
    public static void main(String[] args) 
    {
        int nums[]={2,0,1,0,2,1,0,0,1,2};
        sortColors(nums);
    }
    public static void sortColors(int[] nums)
    {
        int n=nums.length;
        int temp[]= new int[n];
        int i=0,j=n-1;
        for(int k=0;k<n;k++)
            {
                if(nums[k]==0)
                    {
                        temp[i]=0;
                        i++;
                    }
                else if(nums[k]==2)
                    {
                        temp[j]=2;
                        j--;
                    }
            }
           for (int k=i;k<=j;k++)
             temp[k]=1; 

           for (int k=0;k<n;k++)
           nums[k]=temp[k];

           for (int k=0;k<n;k++)
              System.out.print(nums[k]+" ");


    }

}