class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String token: tokens) {
            switch(token) {
                case "+" -> {
                    int token1 = stack.pop();
                    int token2 = stack.pop();
                    stack.push(token1 + token2);
                }
                case "-" -> {
                    int token1 = stack.pop();
                    int token2 = stack.pop();
                    stack.push(token2 - token1);
                }
                case "/" -> {
                    int token1 = stack.pop();
                    int token2 = stack.pop();
                    stack.push(token2 / token1);
                }
                case "*" -> {
                    int token1 = stack.pop();
                    int token2 = stack.pop();
                    stack.push(token1 * token2);

                }
                default -> {
                    stack.push(Integer.parseInt(token));
                }

            }
        }

        return stack.pop();
        
    }


}
