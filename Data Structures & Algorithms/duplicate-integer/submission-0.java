class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<>();
        for(int x: nums) {
            set.add(x);
        }
        
        return !(nums.length == set.size());
    }
}