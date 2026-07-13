package main.java;

public class ArraysSmallestSubArraySum {

	 public static void main(String[] args) {
	        int[] arr = {3, 2, 1, 2, 4, 3, 2, 4,1};
	        int target = 7;

	        findSmallestSubArray(arr, target);
	    }

	    private static void findSmallestSubArray(int[] arr, int target) {
	        int left = 0;
	        int sum = 0;

	        int minLength = Integer.MAX_VALUE;
	        int startIndex = -1;
	        int endIndex = -1;

	        for (int right = 0; right < arr.length; right++) {
	            sum += arr[right];

	            while (sum >= target) {
	                if (sum == target && (right - left + 1) < minLength) {
	                    minLength = right - left + 1;
	                    startIndex = left;
	                    endIndex = right;
	                }

	                sum -= arr[left];
	                left++;
	            }
	        }

	        if (startIndex == -1) {
	            System.out.println("No subarray found.");
	        } else {
	            System.out.println("Length: " + minLength);
	            System.out.print("Subarray: ");

	            for (int i = startIndex; i <= endIndex; i++) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }

}
