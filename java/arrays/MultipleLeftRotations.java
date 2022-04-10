/*
Problem Description
  Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

  Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

Problem Constraints
  1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

Input Format
  The first argument given is the integer array A.
  The second argument given is the integer array B.

Output Format
  Return the resultant matrix.

Example Input
  Input 1:
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:
    A = [5, 17, 100, 11]
    B = [1]

Example Output
  Output 1: [ [3, 4, 5, 1, 2] [4, 5, 1, 2, 3] ]
  Output 2: [ [17, 100, 11, 5] ]
*/
public class Solution {
    
    void reverse(int[] arr, int s, int e) throws ArrayIndexOutOfBoundsException {
        int tmp;
        while (s < e) {
            tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++;
            e--;
        }
    }

    public int[][] solve(int[] A, int[] B) throws ArrayIndexOutOfBoundsException {
        int n = A.length;        
        int[][] result = new int[B.length][n];

        for(int i=0; i<B.length; i++) {
            
            for (int j=0; j<n; j++) {
                result[i][j] = A[j];
            }
            
            int rotations = B[i] % n;
            reverse(result[i], 0, n-1);
            reverse(result[i], 0, n - rotations - 1);
            reverse(result[i], n - rotations, n-1);
        }
        
        return result;
    }
}
