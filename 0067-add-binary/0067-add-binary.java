class Solution {
    public String addBinary(String a, String b) {
//         int num1 = Integer.parseInt(a,2);
//         int num2 = Integer.parseInt(b,2);
//         //String ans = "test";
//         // List<Integer> list1 = new ArrayList<Integer>();
//         // List<Integer> list2 = new ArrayList<Integer>();
//         int sum = num1+num2;
//         String ans = Integer.toBinaryString(sum);
        
//         return ans;
         StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0)
        carry += a.charAt(i--) - '0';
      if (j >= 0)
        carry += b.charAt(j--) - '0';
      sb.append(carry % 2);
      carry /= 2;
    }

    return sb.reverse().toString();
    }
}