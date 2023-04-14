class Solution {
    public int longestPalindromeSubseq(String s) {
    int m = s.length();
    int n = s.length();
        String r = "";
        for (int i=0; i<s.length(); i++)
      {
        char ch= s.charAt(i); //extracts each character
        r= ch+r; //adds each character in front of the existing string
      }
    // dp[i][j] := LCS's length of text1[0..i) and text2[0..j)
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        dp[i + 1][j + 1] = s.charAt(i) == r.charAt(j)
                               ? 1 + dp[i][j]
                               : Math.max(dp[i][j + 1], dp[i + 1][j]);

    return dp[m][n];
    }
}