class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int i = (left + right) / 2;
            
            if (nums[i] == target) {
                return i;
            }
            else if (nums[i] < target) {
                left = i + 1;
            }
            else {
                right = i - 1;
            }
        }

        if (nums[left] == target)
            return left;

        return -1;
        
    }
}
