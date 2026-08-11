class Solution {
    public int totalFruit(int[] fruits) {
        int lF = -1;  // lastFruit
        int sF = -1;  // secondLastFruit
        int lC = 0;   // lastFruitCount
        int cur = 0;  // currentMax
        int max = 0;  // maxFruits

        for (int f : fruits) {
            if (f == lF || f == sF) {
                cur++;
            } else {
                cur = lC + 1;
            }
            if (f == lF) {
                lC++;
            } else {
                lC = 1;
                sF = lF;
                lF = f;
            }

            max = Math.max(max, cur);
        }

        return max;
    }
}
