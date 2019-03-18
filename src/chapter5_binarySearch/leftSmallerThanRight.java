package chapter5_binarySearch;
/*
 * BSiteration: while(left < right)
 * when left = right > target, loop stop
 * at that time, left = right
 * 
 */
public class leftSmallerThanRight {
	public static int BSiteration(int[] nums, int target) {
		int low = 0;
		int high = nums.length;	//not nums.length - 1 in this method; //equivalent to [low, high)
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(nums[mid] < target) {	//equivalent to [low, high)
				low = mid + 1;
			}else if(nums[mid] > target) {
				high = mid;	//not mid - 1 in this method; //equivalent to [low, high)
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {22, 33, 44, 55, 66, 77};
		System.out.println(BSiteration(nums, 45));
	}
}
