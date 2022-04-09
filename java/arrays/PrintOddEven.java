import java.lang.*;
import java.util.*;

/*
Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.
NOTE: Array elements should have the same relative order as in A.

Problem Constraints
1 <= T <= 10
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
First line of the input contains a single integer T.

For each test case:
First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.

Output Format
For each test case:
First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A

Example Input
  Input 1:
   2 
   5
   1 2 3 4 5
   3
   4 3 2
  Input 2:
   2 
   3
   2 2 2
   2
   1 1

Example Output
  Output 1:
   1 3 5
   2 4
   3
   4 2
  Output 2:
   2 2 2
   1 1
*/
public class PrintOddEven {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void printOddEvenArray(int[] A, int size) {
        int oddSize = 0;
        int evenSize = 0;
        for(int i=0; i<size; i++) {
            if (A[i] % 2 == 0) {
                evenSize++;
            } else {
                oddSize++;
            }
        }
        
        int[] odd = new int[oddSize];
        int[] even = new int[evenSize];
        int oIndex = 0, eIndex = 0;
        for(int j=0; j<size; j++) {
            if (A[j] % 2 == 0) {
                even[eIndex] = A[j];
                eIndex++;
            } else {
                odd[oIndex] = A[j];
                oIndex++;
            }
        }

        printArray(odd);
        printArray(even);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int testCases = Integer.parseInt(line);
        for(int tc=1; tc<=testCases; tc++) {
            line = scanner.nextLine();
            int size = Integer.parseInt(line);

            line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line," ");
            int index = 0;
            int[] A = new int[size];
            while (index < size && st.hasMoreTokens()) {
                A[index] = Integer.parseInt(st.nextToken());
                index++;
            }

            printOddEvenArray(A, size);
        }
    }
}
