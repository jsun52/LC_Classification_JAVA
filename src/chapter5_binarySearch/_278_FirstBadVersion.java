package chapter5_binarySearch;
/*
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example:

Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 
 */
public class _278_FirstBadVersion {
	public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low + 1 < high){
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid;
            }
        }
        if(isBadVersion(low)){
            return low;
        }else{
            return high;
        }
    }
}

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
/*//solution1: left <= right
public class Solution extends VersionControl {
public int firstBadVersion(int n) {
  int left = 1;
  int right = n;
  while(left <= right){
      int mid = (right - left)/2 + left;
      if(isBadVersion(mid)){
          right = mid - 1;
      }else{
          left = mid + 1;
      }
  }
  return left;
}
}*/


//soultion2: left < right
/*public class Solution extends VersionControl {
public int firstBadVersion(int n) {
  int left = 1;
  int right = n;  //testcase using n out of bound of Integer
  while(left < right){
      int mid = (right - left)/2 + left;
      if(isBadVersion(mid)){
          right = mid;
      }else{
          left = mid + 1;
      }
  }
  return left;
}
}*/

/*
//soultion3: left +1 < right
public class Solution extends VersionControl {
public int firstBadVersion(int n) {
  int left = 1;
  int right = n;
  while(left + 1 < right){
      int mid = (right - left)/2 + left;
      if(isBadVersion(mid)){
          right = mid;
      }else{
          left = mid;
      }
  }
  if(isBadVersion(left)){
      return left;
  }else{
      return right;
  }
}
}*/