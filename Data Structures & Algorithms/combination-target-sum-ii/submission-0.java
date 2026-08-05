class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        uniqueCombinations(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    void uniqueCombinations(int currentIndex, int[] candidates, int target,
     List<List<Integer>> result, List<Integer> currentCombination) {

        if(target == 0) {
            result.add(currentCombination);
            return;
        }

        if (currentIndex >= candidates.length || target < 0 ) return;


        int curr = candidates[currentIndex];

        currentCombination.add(curr);
        uniqueCombinations(currentIndex + 1, candidates, target - curr,
            result, new ArrayList(currentCombination));
        currentCombination.remove(currentCombination.size() - 1);

while (currentIndex + 1 < candidates.length && candidates[currentIndex] == candidates[currentIndex + 1]) {
            currentIndex++;
        }

        uniqueCombinations(currentIndex + 1, candidates, target,
            result, new ArrayList(currentCombination));

    }
}
