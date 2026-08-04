class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (int[] a, int[] b) -> {
                double distance1 = Math.sqrt((a[0]) * (a[0])
                + (a[1]) * (a[1]));
                double distance2 = Math.sqrt((b[0]) * (b[0])
                + (b[1]) * (b[1]));
                return Double.compare(distance1, distance2);
            }
        );

        for(int[] point: points) {
            queue.offer(point);
        }

        int[][] result = new int[k][2];

        for(int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
        

    }
}
