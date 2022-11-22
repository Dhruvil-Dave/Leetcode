class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> zero = new ArrayList<Integer>();
        List<Integer> non = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero.add(nums[i]);
            }
            else{
                non.add(nums[i]);
            }
        }
        int m = zero.size();
        for(int i=0;i<m;i++){
            non.add(0);
        }
        for(int i=0;i<n;i++){
            nums[i]=non.get(i);
        }
    }
}