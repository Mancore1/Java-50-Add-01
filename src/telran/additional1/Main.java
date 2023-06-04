package telran.additional1;

public class Main {
	public static void main(String[] args) {
		int[] array = {1, 3, 3, 2, 8, 8, 8, 5, 6};
		System.out.println(maxSubsequenceLength(array));
	}
	
	
public static int maxSubsequenceLength(int[] arr) {
	int counter = 1;
	int max = 0;
	for(int i = 1; i < arr.length; i++) {
		if (arr[i] == arr[i - 1]) {
			counter++;
			max = Math.max(max, counter);
		} else {
			counter = 1;
		}
	}
	return max;
	}
}