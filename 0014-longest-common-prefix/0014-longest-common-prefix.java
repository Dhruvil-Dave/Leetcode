class Solution {
    public String longestCommonPrefix(String[] strs) {
//         String ans = "";
//         int[][] arr = new int[strs.length()][200];
//         for(int i=0;i<strs.length();i++){
//             for(int j=0;j<strs[i].length();j++){
                
//             }
//         }
        if (strs.length == 0)
      return "";

    for (int i = 0; i < strs[0].length(); ++i)
      for (int j = 1; j < strs.length; ++j)
        if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
          return strs[0].substring(0, i);

    return strs[0];
    }
}