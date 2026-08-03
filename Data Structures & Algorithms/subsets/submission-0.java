class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of());

        for(int num: nums) {
            ListIterator<List<Integer>> it = result.listIterator();
            while (it.hasNext()) {
                List<Integer> element = it.next();
                List<Integer> temp = new ArrayList(element);
                temp.add(num);
                it.add(temp);
            }
        }

        return result;
        
    }
}
