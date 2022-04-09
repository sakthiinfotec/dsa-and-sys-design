/*
Problem Description
  Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Problem Constraints
  1 <= A.size() <= 104
  1 <= A[i] <= 109
  1 <= B <= 109

Input Format:
  First argument is an integer array A.
  Second argument is an integer B.

Output Format:
  Return 1 if good pair exist otherwise return 0.
*/
public class CheckNumberPair {
    public int solve(int[] A, int B) {
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<i; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
