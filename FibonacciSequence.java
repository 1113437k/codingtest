import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        // index 0 1 2 3 4 5 6 7
        // value 0 1 1 2 3 5 8 13


        int dp = dp(8);
        System.out.println(dp);
    }

    /**
     * Dynamic programming
     * Time complexity : O(n)
     * target : value position 1 ~ n, not index
     */
    private static int dp(int target) {
        int n = target - 1;
        int[] fb_arr = new int[n + 1];
        fb_arr[0] = 0;
        fb_arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            fb_arr[i] = fb_arr[i - 1] + fb_arr[i - 2];
        }

        System.out.println(Arrays.toString(fb_arr));

        return fb_arr[n];
    }
}
