/*
Problem Description
  Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Problem Constraints
  1 <= n <= 105
  -105 <= A[i] <= 105

Input Format
  First argument contains an array A of integers of size N

Output Format
  Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Example Input
  Input 1:
    A=[2, 1, 6, 4]
  Input 2:
    A=[1, 1, 1]

Example Output
  Output 1: 1
  Output 2: 3
*/
public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int[] pso = new int[n];
        int[] pse = new int[n];

        pse[0] = A[0];
        pso[0] = 0;
        for(int k=1; k<n; k++) {
            pse[k] = pse[k-1];
            pso[k] = pso[k-1];
            if(k % 2 == 0) {
                pse[k] = pse[k-1] + A[k];
            } else {
                pso[k] = pso[k-1] + A[k];
            }
        }

        int sEven, sOdd, count = 0;
        for (int i=0; i<n; i++) {
            if(i==0) {
                sOdd = pse[n-1] - pse[i];
                sEven = pso[n-1] - pso[i];
            } else if(i==n-1) {
                sOdd = pso[i-1];
                sEven = pse[i-1];
            } else {
                sOdd = pso[i-1] + pse[n-1] - pse[i];
                sEven = pse[i-1] + pso[n-1] - pso[i];
            }

            if(sOdd == sEven) {
                count++;
            }
        }
        return count;
    }
}
