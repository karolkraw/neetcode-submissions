class Solution {
    boolean checkValidParantheses(ArrayDeque<Character> stack, char c) {
        if (stack.isEmpty()) return false;
        if(!(stack.pop() == c)) return false;
        return true;
    }


    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()) {
            switch(c) {
                case '(', '[', '{' -> stack.push(c);
                case ')' -> {if(!checkValidParantheses(stack, '(')) return false;}
                case ']' -> {if(!checkValidParantheses(stack, '[')) return false;}
                case '}' -> {if(!checkValidParantheses(stack, '{')) return false;}

                default -> {return false;}
            }
        }

        return stack.isEmpty();
        
    }
}
