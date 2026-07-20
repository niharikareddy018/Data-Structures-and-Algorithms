import java.util.Arrays;

public class longestCommonSubSeq {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, 0, text1, text2, dp);
    }

    public static int solve(int i, int j, String t1, String t2, int[][] dp) {

        if (i == t1.length() || j == t2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (t1.charAt(i) == t2.charAt(j)) {
            dp[i][j] = 1 + solve(i + 1, j + 1, t1, t2, dp);
        } else {
            dp[i][j] = Math.max(solve(i + 1, j, t1, t2, dp), solve(i, j + 1, t1, t2, dp));
        }
        return dp[i][j];
    }
}