public class BinarySearchAlgorithm {

	public static boolean binarySearch(int[] arr, int key) {
		if(arr.length == 0) {
			return false;
		}
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == key) {
				return true;
			}
			if(arr[mid] > key) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return false;
	}
}
