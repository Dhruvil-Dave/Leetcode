class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int minDiff = Integer.MAX_VALUE;
        long prefix = 0;
        long suffix = Arrays.stream(nums).asLongStream().sum();

        for (int i = 0; i < nums.length; ++i) {
          prefix += nums[i];
          suffix -= nums[i];
          int prefixAvg = (int) (prefix / (i + 1));
          int suffixAvg = (i == n - 1) ? 0 : (int) (suffix / (n - i - 1));
          int diff = Math.abs(prefixAvg - suffixAvg);
          if (diff < minDiff) {
            ans = i;
            minDiff = diff;
          }
        }

        return ans;
    }
}