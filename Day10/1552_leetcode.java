package Day10;
import java.util.*;
class Solution {
    public static void main(String []args) 
    {
        int[] position={1,2,3,4,5,6,7,8,9,10};
        int m=4;
        Arrays.sort(position);
        int lo=1;
        int hi=position[position.length-1]-position[0];
        while(lo<=hi)
            {
               int mid=lo+(hi-lo)/2;
                if(check(position, mid)>=m) 
                {
                    lo=mid+1;
                }
                else
                    hi=mid-1;
                
                }
                System.out.println(hi);
        }
    public static int check(int []position,int mid)
        {
            int balls=1;
            int lastplaced=0;
            for (int i=1;i<position.length;i++)
                {
                    if(position[i]-position[lastplaced]>=mid)
                        {
                            balls++;
                            lastplaced=i;
                        }
                } 
            return balls;
        }
}