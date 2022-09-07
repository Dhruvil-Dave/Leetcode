class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        int current_left_max = left[0];
        int current_right_max = right[n-1];
        for(int i=1;i<n;i++){
            current_left_max = Math.max(current_left_max,height[i]);
            left[i] = current_left_max;
        }
        for(int i=n-2;i>=0;i--){
            current_right_max = Math.max(current_right_max,height[i]);
            right[i] = current_right_max;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.min(left[i],right[i]) - height[i]; 
        }
        return sum;
    }
}