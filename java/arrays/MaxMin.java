
import java.lang.*;
import java.util.*;

/*
Problem Description
Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and other N elements as input from the user.

Problem Constraints
1 <= N <= 1000
1 <= A <= 1000

Input Format
A single line representing N followed by N integers of the array A

Output Format
A single line containing two space separated integers representing maximum and minimum elements of the input array.

Example Input
Input 1: 5 1 2 3 4 5
Input 2: 4 10 50 40 80

Example Output
Output 1: 5 1
Output 2: 80 10
*/
public class MaxMin {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    StringTokenizer st = new StringTokenizer(line," ");
    int n = Integer.parseInt(st.nextToken());
    int index = 0;
    int[] arr = new int[n];
    while (st.hasMoreTokens()) {
        arr[index] = Integer.parseInt(st.nextToken());
        index++;
    }

    int min = arr[0], max = arr[0];
    for (int i=1; i<n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    System.out.println(max + " " + min);
  }
}
