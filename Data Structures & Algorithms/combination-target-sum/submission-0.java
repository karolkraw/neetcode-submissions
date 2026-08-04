class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        var result = new ArrayList<List<Integer>>();
        combinationSum(nums, 0, target, result, new ArrayList<Integer>());
        return result;
    }

    void combinationSum(int[] nums, int i, int target,
        List<List<Integer>> result, List<Integer> temp) {
        if (target == 0) {
            result.add(temp);
            return;
        }
  

        if (i >= nums.length || target < 0) return;

        temp.add(nums[i]);
        combinationSum(nums, i, target - nums[i], result, new ArrayList<>(temp));
        temp.remove(temp.size() - 1);
        combinationSum(nums, i + 1, target, result, new ArrayList<>(temp));
    }
}
