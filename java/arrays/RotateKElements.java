import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

/*
Given an integer array A and an integer B, you have to print the same array after rotating it B times towards the right.

NOTE: You can use extra memory.

Problem Constraints

1 <= |A| <= 106
1 <= A[i] <= 109
1 <= B <= 109

Input Format
The first line begins with an integer A denoting the length of an array, and then A integers represent the array elements.
The second line contains a single integer B


Output Format
Print an array of integers which is the Bth right rotation of input array A, on a separate line.


Example Input

Input 1:
 4 1 2 3 4
 2

Input 2:
 3 1 2 2
 3

Example Output

Output 1:
 3 4 1 2
Output 2:
 1 2 2
 */
public class RotateKElements {
  static void reverse(int[] arr, int s, int e) {
    int tmp;
    while (s < e) {
      tmp = arr[s];
      arr[s] = arr[e];
      arr[e] = tmp;
      s++;
      e--;
    }
  }

  static void rotate(int[] arr, int n, int k) {
    reverse(arr, 0, n-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] input = line.split(" ", 2);

    int size = Integer.parseInt(input[0]);

    int[] arr = new int[size];
    int index=0;
    StringTokenizer st = new StringTokenizer(input[1]," ");  
    while (st.hasMoreTokens()) {  
        arr[index] = Integer.parseInt(st.nextToken());
        index++;
    }  

    int times = scanner.nextInt();
    if (times > 0) {
        int k = times % size;
        rotate(arr, size, k);
    }

    for (int i=0; i<size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

