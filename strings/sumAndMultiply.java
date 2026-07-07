class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]) && ch[i] != '0') {
                sum += ch[i] - '0';
                sb.append(ch[i]);
            }
        }
        if (sb.length() == 0) {
            return 0;
        }
        int x = Integer.parseInt(sb.toString());
        long ans = (long) x * sum;
        return ans;
    }
}