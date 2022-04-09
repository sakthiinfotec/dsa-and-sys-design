import java.lang.*;
import java.util.*;

/*
Problem Description
You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints
1 <= T <= 10
1 <= |A| <= 105
1 <= A[i], B <= 109

Input Format
First line of the input contains a single integer T.

Next, each of the test case consists of 2 lines:

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B

Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.

Example Input
Input 1:
 1 
 5 4 1 5 9 1
 5
Input 2:
 1
 3 7 7 2
 1 

Example Output
Output 1: 1 
Output 2: 0 
*/
public class Main {
    
    static int checkIfElementExists(int[] arr, int n, int number) {
        for(int i=0; i<n; i++) {
            if(arr[i] == number)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int testCases = Integer.parseInt(line);
        for(int tc=1; tc<=testCases; tc++) {
            line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line," ");
            
            int size = Integer.parseInt(st.nextToken());
            
            int index = 0;
            int[] A = new int[size];
            while (st.hasMoreTokens()) {
                A[index] = Integer.parseInt(st.nextToken());
                index++;
            }

            line = scanner.nextLine();
            int B = Integer.parseInt(line);
            System.out.println(checkIfElementExists(A, size, B));
        }        
    }
}
