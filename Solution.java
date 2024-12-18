import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] testCase1 = { 8, 4, 6, 2, 3 };
        System.out.println(Arrays.toString(finalPrices(testCase1)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] answer = prices;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
}