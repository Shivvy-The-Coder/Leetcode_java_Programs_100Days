package Day8;
import java.util.*;
class Solution {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        List<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{difficulty[i], profit[i]});
        }
        jobs.sort((a, b) -> a[0] - b[0]);

        Arrays.sort(worker);

        int[] maxProfitAtDifficulty = new int[n];
        maxProfitAtDifficulty[0] = jobs.get(0)[1];
        for (int i = 1; i < n; i++) {
            maxProfitAtDifficulty[i] = Math.max(maxProfitAtDifficulty[i - 1], jobs.get(i)[1]);
        }

        int totalProfit = 0;
        int j = 0; 
        for (int w : worker) {
            while (j < n && jobs.get(j)[0] <= w) {
                j++;
            }
            if (j > 0) {
                totalProfit += maxProfitAtDifficulty[j - 1];
            }
        }

        return totalProfit;
    }
}
