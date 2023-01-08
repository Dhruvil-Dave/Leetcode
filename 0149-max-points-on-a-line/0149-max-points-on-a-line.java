class Solution {
    public int maxPoints(int[][] points) {
     if (points.length <= 2) return points.length;
        int max = 0;
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            else return b[1] - a[1];
        });
        for (int i = 0; i < points.length; i++) {
            Map<Double, Set<int[]>> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                int x = points[i][0] - points[j][0];
                double slope = Integer.MAX_VALUE;
                if (x != 0) {
                    slope = (double)(points[i][1] - points[j][1]) / x; 
                }
                Set<int[]> set = map.getOrDefault(slope, new HashSet<>());
                set.add(points[i]);
                set.add(points[j]);
                map.put(slope, set);
                if (set.size() > max) max = set.size();
            }
        }
        return max;
    }    
}