package chapter5_binarySearch;
/*
 * binary search iteration method: while(left <= right)
 * when right< target < left, loop stop
 * at that time, right + 1 = left
 */
public class leftSmallerOrEqualToRight {
	public static int BSiteration(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high) {	//equivalent to [low, high]
			int mid = low + (high - low) / 2;
			if(nums[mid] > target) {	//equivalent to [low, high]
				high = mid - 1;
			}else if(nums[mid] < target) {	//equivalent to [low, high]
				low = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {22, 33, 44, 55, 66, 77};
		System.out.println(BSiteration(nums, 54));
	}
}
