import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
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

