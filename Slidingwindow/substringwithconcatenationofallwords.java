class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();

        if(s==null || words==null || words.length==0 || s.length()==0)
          return ans;
        int wordLen=words[0].length();
        int totalWords=words.length;
        int windowSize=wordLen*totalWords;

        HashMap<String,Integer> need=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            need.put(word,need.getOrDefault(word,0)+1);
        }
        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int right = offset;
            int count = 0;

            HashMap<String, Integer> seen = new HashMap<>();
            while (right+wordLen<=s.length()){
                String word=s.substring(right, right+wordLen);
                right+=wordLen;
                if (need.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word,0) + 1);
                    count++;

                    while (seen.get(word)>need.get(word)) {
                        String remove=s.substring(left, left+wordLen);
                        seen.put(remove, seen.get(remove) - 1);
                        left+=wordLen;
                        count--;
                    }
                    if(count==totalWords) {
                        ans.add(left);
                        String remove=s.substring(left, left+wordLen);
                        seen.put(remove, seen.get(remove) - 1);
                        left+=wordLen;
                        count--;
                    }
                } else {
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return ans;
    }
}