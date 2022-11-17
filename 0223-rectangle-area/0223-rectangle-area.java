class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=0,area2=0;
        area1 = (ax2-ax1)*(ay2-ay1);
        area2 = (bx2-bx1)*(by2-by1);
        int cx1,cy1,cx2,cy2;
        cx1 = Math.max(ax1,bx1);
        cy1 = Math.max(by1,ay1);
        cx2 = Math.min(ax2,bx2);
        cy2 = Math.min(ay2,by2);
        int ans;
        int cl = cx2-cx1;
        int ch = cy2-cy1;
        int c = 0;
        if(cl>0 && ch>0){
            c = cl*ch;
        }
        ans = area1+area2-c;
        return ans;
    }
}