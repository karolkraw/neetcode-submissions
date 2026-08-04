class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = findMax(piles);

        int l = 1;
        int r = max;

        while (l <= r) {
            int i = (l + r) / 2;
            if (canEatWithinHHours(piles, i, h)) {
                if (l == r) {
                    return l;
                }
                r = i - 1;
            }
            else {
                l = i + 1;
            }
        }

        return l;
        
    }
    int findMax(int[] piles) {
        return Arrays.stream(piles).distinct().max().orElse(1);
    }

    boolean canEatWithinHHours(int[] piles, int i, int h) {
        int result = 0;
        for (int pile: piles) {
            result += calculateHoursToEat(pile, i);
        }
        return result <= h;
    }

    int calculateHoursToEat(int pile, int i) {
        int result = pile / i;
        if ((pile % i) != 0) result++;
        return result;
    }
}
