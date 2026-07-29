class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0)
            return 0;

        if (stones.length == 1)
            return stones[0];

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);

        for (int stone: stones) {
            queue.add(stone);
        }

        while(!(queue.isEmpty() || queue.size() == 1)) {
            int a = queue.poll();
            int b = queue.poll();

            if (a != b) {
                queue.offer(a - b);
            }
          
        }

        if (queue.isEmpty())
            return 0;

        return queue.poll();
        
    }
}
