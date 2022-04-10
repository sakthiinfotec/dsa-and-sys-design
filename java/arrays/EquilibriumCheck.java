/*
Problem Description
  You are given an array A of integers of size N.
  Your task is to find the equilibrium index of the given array
  The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

  NOTE:
    Array indexing starts from 0.
    If there is no equilibrium index then return -1.
    If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
  1 <= N <= 105
  -105 <= A[i] <= 105

Input Format
  First arugment is an array A .

Output Format
  Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
  Input 1:
    A=[-7, 1, 5, 2, -4, 3, 0]
  Input 2:
    A=[1,2,3]

Example Output
  Output 1: 3
  Output 2: -1
*/
public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        
        // Find a prefix sum of a given array A
        int[] ps = new int[n];
        ps[0] = A[0];
        for (int i=1; i<n; i++) {
            ps[i] = ps[i-1] + A[i];
        }

        int sl = 0, sr = 0;
        for (int j=0; j<n; j++) {
            if (j==0) {
                sl = 0;
                sr = ps[n-1] - ps[j];
            } else if (j==n-1) {
                sl = ps[j-1];
                sr = 0;
            } else {
                sl = ps[j-1];           // Sum of 0 to j-1 
                sr = ps[n-1] - ps[j];   // Sum of j+1 to n-1
            }

            if(sl == sr) {
                return j;
            }
        }
        return -1;
    }
}
