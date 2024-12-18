import java.util.Arrays;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        int[] testCase1 = { 8, 4, 6, 2, 3 };
        System.out.println(Arrays.toString(finalPrices(testCase1)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] answer = prices.clone();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                answer[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return answer;
    }
}