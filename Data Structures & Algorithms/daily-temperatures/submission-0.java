class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.offer(0);
        int result[] = new int[temperatures.length];

        for(int i = 1; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int temp = stack.poll();
                result[temp] = i - temp;
            }
            stack.push(i);
        }
        return result;
    }
}
