class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        for(int i=0;i<n;i++){
            if(max<candies[i]){
                max =  candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<Boolean>(n);
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies < max){
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;
    }
}