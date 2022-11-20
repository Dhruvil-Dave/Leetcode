/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n,pivot=0;
        // if(low==high){
        //     return low;
        // }
        while(low<high){
            pivot = low + (high-low)/2;
            if(isBadVersion(pivot)){
                high = pivot;
            }
            else{
                low = pivot+1;
            }
        }
        return low;
    }
}