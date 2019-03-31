package sort;

import java.util.Arrays;
/*
 * time complexity O(n^2)
 *first time we compared n times, second time we compared n-1 times...till 1 time: n + (n - 1) + ... + 1 = (n + 1)n / 2 = O(n^2)
 *
 *space complexity O(1), no extra space is used
 */
public class selectionSort {
	//selection sort an array num[] in ascending order
	public static void selection(int[] num) {
		int temp;
		int minIndex;
		if(num == null || num.length == 0) {
			return;
		}
		for(int i = 0; i < num.length - 1; i++) {	//outer loop: how many iterations
			minIndex = i;
			for(int j = i + 1; j < num.length; j++) {	//inner loop: find the min element in the rest element
				if(num[j] < num[minIndex]) {
					//recording the index of the min element
					minIndex = j;
				}
			}
			//swap the num[i] with num[minINdex]
			temp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] num = new int[] {-2, 3, -5, 4, 7, 23, 1};
		selection(num);
		System.out.println(Arrays.toString(num));
	}
}
