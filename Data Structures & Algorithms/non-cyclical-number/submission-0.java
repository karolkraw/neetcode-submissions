class Solution {
    public boolean isHappy(int n) {
        if (n == 0)
            return false;

        Set<Integer> seen = new HashSet<Integer>();
        int temp = n;

        while (temp != 1) {
            int curr = temp;
            temp = 0;
            while(curr > 0) {
                int x = curr % 10;
                temp += x * x;
                curr /= 10;
        }
            if (seen.contains(temp)) 
                return false;
            seen.add(temp);

        }

        return true;
      

    }
}
