package chapter5_binarySearch;
//search a mun in an array, if find the num return it's index, otherwise return -1
//Binary search_recursion method
public class recursionMethod {
	public static int BSrecursion(int[] nums, int low, int high, int target) {
		if(low > high) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if(nums[mid] > target) {
			return BSrecursion(nums, low, mid - 1, target);
		}else if(nums[mid] < target) {
			return BSrecursion(nums, mid + 1, high, target);
		}else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {22, 33, 44, 55, 66, 77, 88};
		System.out.println(BSrecursion(nums, 0, 6, 67));
	}
}
