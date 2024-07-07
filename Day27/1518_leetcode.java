package Day27;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange)
    {
        int div= numBottles,ans=0;        
        while(numBottles>1)
        { 
            int rem= numBottles%numExchange;
             numBottles/= numExchange;
             ans+= numBottles;
             numBottles=numBottles>0 ? numBottles+=rem : numBottles;
        }
        return ans+div;
    }
}