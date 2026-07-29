class Solution {
    public int[] twoSum(int[] nums, int target) {
        var targets = new HashMap<Integer, Integer>();


        for(int i = 0; i < nums.length; i++) {
            if (targets.containsKey(nums[i]))
                return new int []{targets.get(nums[i]), i};
            
            targets.put(target - nums[i], i);

        }
        
        return new int[2];    }

}
