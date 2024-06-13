package Day3;

import java.util.*;
class Solution {
    public static int minMovesToSeat(int[] seats, int[] students) 
    {
        int sum=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i=0;i<seats.length;i++)
            {
                sum+=Math.abs(seats[i]-students[i]);
            }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args)
    {
        int []seats = {3,1,5};
        int []students = {2,7,4};
        minMovesToSeat(seats, students);
    }
}