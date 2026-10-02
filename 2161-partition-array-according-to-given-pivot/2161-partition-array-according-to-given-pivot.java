class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length]; // new list to store result 
        int idx = 0;

        // Pass 1: Copy all numbers strictly LESS than pivot
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < pivot) {
                result[idx] = nums[i];
                idx++;
            }
        }

        // Pass 2: Copy all numbers EQUAL to pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                result[idx] = nums[i];
                idx++;
            }
        }

        // Pass 3: Copy all numbers strictly GREATER than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                result[idx] = nums[i];
                idx++;
            }
        }

        // 2. Return the fully arranged array
        return result;
    }
}