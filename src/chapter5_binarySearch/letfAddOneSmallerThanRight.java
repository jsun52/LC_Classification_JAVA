package chapter5_binarySearch;
/*
 * Binary search iteration: while(left + 1 < right)
 * when loop stop, at that time:left < target < right, and left + 1 = right
 */
public class letfAddOneSmallerThanRight {
	public static int BSiteration(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while(low + 1 < high) {
			int mid = low + (high - low) / 2;
			if(nums[mid] < target) {
				low = mid;
			}else if(nums[mid] > target) {
				high = mid;
			}else {
				return mid;
			}
		}
		//if two nums next to each other, the loop stop, we have to make sure if the target equal to either of them
		if(nums[low] == target) {
			return low;
		}else if(nums[high] == target) {
			return high;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {22, 33, 44, 55, 66, 77, 88};
		System.out.println(BSiteration(nums, 89));
	}
}
