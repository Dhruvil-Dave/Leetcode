class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //int[] arr = new int[n];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        k = k % n;
        // for(int i=0;i<n;i++){
        //     arr[i]=nums[i];
        // }
        // for(int i=n;i<2*n;i++){
        //     arr[i]=nums[i-n];
        // }
        //System.out.println(nums);
        //System.out.println(arr[13]);
        int r = n-k;
        for(int i=r;i<n;i++){
            arr.add(nums[i]);
        }
        int l=0;
        for(int i=l;i<r;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=arr.get(i);
        }
    }
}