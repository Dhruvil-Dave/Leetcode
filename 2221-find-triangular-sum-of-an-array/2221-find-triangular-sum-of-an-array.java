class Solution {
    public int triangularSum(int[] nums) {
    
        for (int n= nums.length; n > 0; n--)
          for (int i = 0; i + 1 < n; i++)
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        return nums[0];
    }
}