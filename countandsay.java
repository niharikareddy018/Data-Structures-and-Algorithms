class Solution {
    public String countAndSay(int n) {
        String curr="1";
        for(int i=2;i<=n;i++){
            StringBuilder next=new StringBuilder();
            int j=0;
            while(j<curr.length()){
                int count=1;
                while(j<curr.length()-1 && curr.charAt(j)==curr.charAt(j+1)){
                    count++;
                    j++;
                }
                next.append(count);
                next.append(curr.charAt(j));

                j++;
            }
            curr=next.toString();
        }
        return curr;
    }
}