class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        var occurrences = new HashMap<Integer, Integer>();

        for(int i: nums) {
            occurrences.putIfAbsent(i, 1);
            occurrences.put(i, occurrences.get(i) + 1);
        }

        

        var queue = new PriorityQueue<Integer>(Comparator.comparingInt(
            occurrences::get
        ).reversed());
        
        for (int key : occurrences.keySet()) {
            queue.offer(key);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
                result[i] = queue.poll();
        }

        return result;

    }
}
