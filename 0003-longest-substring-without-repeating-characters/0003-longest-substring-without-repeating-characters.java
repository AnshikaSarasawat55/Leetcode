class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxlen=0;
        int len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l, map.get(s.charAt(r)) + 1);
                len=r-l;
            }
            len ++;
            maxlen=Math.max(maxlen,len);
            map.put(s.charAt(r),r);
            r++;

        }
        return maxlen;
        
    }
}