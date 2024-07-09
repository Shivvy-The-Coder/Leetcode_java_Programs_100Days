package Day29;

class Solution {
    public double averageWaitingTime(int[][] customers)
    {
        double start =0, end=0, wait=0;
        for (int i=0;i<customers.length;i++)
            {
                for(int j=0;j<1;j++)  
                    {
                        start=customers[i][0];
                        if((i==0&& j==0 )||end <start)
                            {
                                end=start+customers[i][1];
                                
                            }
                        else
                            {
                                end+=customers[i][1];
                            }
                        wait+=(end-start);             
                    }
            }  
            return wait/customers.length;  
        }
}