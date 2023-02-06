class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] ans = new int[m];
        // int[] first = new int[n];
        // int[] last = new int[n];
        // for(int i=0;i<n;i++){
        //     first[i] = nums[i];
        // }
        int a = 0;
        int b = n;
        for(int i=0;i<m;i++){
            if(i%2==0){
                ans[i]=nums[a];
                a++;
            }
            else{
                ans[i]=nums[b];
                b++;
            }
        }
        return ans;
    }
}