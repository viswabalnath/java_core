package main.java;

public class ArrayLargestSubArraySum {
	public static void main(String[] args) {
        int[] arr = {3,1,1,2,2, 2, 1,1, 2, 4, 3, 1, 2, 1};
        int target = 7;

        findLargestSubArray(arr, target);
    }

    private static void findLargestSubArray(int[] arr, int target) {

        int left = 0;
        int sum = 0;

        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int length = right - left + 1;

                if (length > maxLength) {
                    maxLength = length;
                    start = left;
                    end = right;
                }
            }
        }

        if (start == -1) {
            System.out.println("No subarray found.");
        } else {
            System.out.println("Length: " + maxLength);
            System.out.print("Subarray: ");

            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
