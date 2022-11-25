class Solution {
    public int sumSubarrayMins(int[] arr) {
//         int sum=0;
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             int min=arr[i];
//             for(int k=i;k<n;k++){
//                 if(min>arr[k]){
//                     min=arr[k];
                    
//                     //sum+=min;
//                 }
//                 sum+=min;
//                 // System.out.println(sum);
//                 // System.out.println(min+" this is min");
                
//             }
//         }
//         return sum;
        int kMod = 1_000_000_007;
        int n = arr.length;
        long ans = 0;
        int[] prev = new int[n];
        int[] next = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.fill(prev, -1);
        Arrays.fill(next, n);

        for (int i = 0; i < arr.length; ++i) {
          while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
            int index = stack.pop();
            next[index] = i;
          }
          if (!stack.isEmpty())
            prev[i] = stack.peek();
          stack.push(i);
        }

        for (int i = 0; i < arr.length; ++i) {
          ans += (long) arr[i] * (i - prev[i]) * (next[i] - i);
          ans %= kMod;
        }

        return (int) ans;
    }
}