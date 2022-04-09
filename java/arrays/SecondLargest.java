/*
Problem Description
  You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints
  1 <= |A| <= 105
  0 <= A[i] <= 109

Input Format
  The first argument is an integer array A.

Output Format
  Return the second largest element. If no such element exist then return -1.

Example Input
  Input 1: A = [2, 1, 2] 
  Input 2: A = [2]

Example Output
  Output 1: 2 
  Output 2: -1 
*/
public class SecondLargest {
    public int solve(int[] A) {
      int n = A.length;
      if (n < 2) {
          return -1;
      }

      int largest = A[0], largestIndex = 0;
      for(int i=0; i<n; i++) {
          if (A[i] > largest) {
              largest = A[i];
              largestIndex = i;
          }
      }

      int secondLargest = A[0];
      for(int j=0; j<n; j++) {
          if (j != largestIndex && A[j] >= secondLargest) {
              secondLargest = A[j];
          }
      }

      return secondLargest;
    }
}
