class KthLargest {

    int k;
    PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue(k);
        for(int num: nums) {
             add(num);
        }

    }
    
    public int add(int val) {
        if (queue.size() == k) {
            if(queue.peek() < val) {
                queue.poll();
            queue.offer(val);
            }
       
        } 
        else {
            queue.offer(val);
        }
        return queue.peek();
    }

}
