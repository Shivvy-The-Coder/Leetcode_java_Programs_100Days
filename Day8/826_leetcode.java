package Day8;
import java.util.*;
class Solution {

    public static void main(String[] args) {

        // int[] difficulty={2,4,6,8,10};
        // int[] profit={10,20,30,40,50};
        // int[] worker={4,5,6,7};
        // System.out.println(maxProfitAssignment( difficulty, profit, worker) );

        // int[] difficulty={85,47,57};
        // int[] profit={10,20,30,40,50};
        // int[] worker={4,5,6,7};
        // System.out.println(maxProfitAssignment( difficulty, profit, worker) );

        int[] difficulty={68,35,52,47,86};
        int[] profit={67,17,1,81,3};
        int[] worker={92,10,85,84,82};
        System.out.println(maxProfitAssignment( difficulty, profit, worker) );

        // int[] difficulty={5,50,92,21,24,70,17,63,30,53};
        // int[] profit={68,100,3,99,56,43,26,93,55,25};
        // int[] worker={96,3,55,30,11,58,68,36,26,1};
        // System.out.println(maxProfitAssignment( difficulty, profit, worker) );
    }



    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();       
        for(int i=0;i<difficulty.length;i++)
        { map.put(difficulty[i] ,profit[i]);
        }
        Arrays.sort(difficulty);  
        int val=0; 
        for(int i=0;i<worker.length;i++)
            {
                 val+=search_profit(worker[i],difficulty,map,profit);
            }
        return val;
 
    }


    public static int search_profit(int worker,int [] difficulty,HashMap<Integer, Integer> map ,int[] profit)
        {
            int i=0,j=difficulty.length-1;
            var ans =-1;
           
            while(i<=j)
                {
                    int mid =(i+j)/2;
                    if(difficulty[mid]<=worker)
                            {
                                ans=difficulty[mid];
                                i=mid+1;
                            }
                    else
                        j=mid-1;
                }
                if(ans==-1)
                    return 0;
                int k=0;
                int max=Integer.MIN_VALUE;
                for (k=0;k<difficulty.length && difficulty[k]<=ans;k++)
                    {
                        max=Math.max(max,map.get(difficulty[k]));
                    }
                    
                return max;
        }
}