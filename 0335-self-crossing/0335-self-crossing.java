class Solution {
    public boolean isSelfCrossing(int[] distance) {
        if(distance.length<=3){
            return false;
        }
        for (int i = 3; i < distance.length; ++i) {
          if (distance[i - 2] <= distance[i] && distance[i - 1] <= distance[i - 3])
            return true;
          if (i >= 4 && distance[i - 1] == distance[i - 3] && distance[i - 2] <= distance[i] + distance[i - 4])
            return true;
          if (i >= 5 && distance[i - 4] <= distance[i - 2] && distance[i - 2] <= distance[i] + distance[i - 4] && distance[i - 1] <= distance[i - 3] &&
              distance[i - 3] <= distance[i - 1] + distance[i - 5])
            return true;
        }

        return false;
        }
}