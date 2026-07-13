class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> digits=new ArrayList<>();
         String digit = "123456789";

        for(int len=2;len<=9;len++) {
            for (int start=0;start<=9-len;start++) {
                int num=Integer.parseInt(digit.substring(start,start+len));

                if(num>=low && num<=high) {
                    digits.add(num);
                }
            }
        }
        return digits;
    }
}