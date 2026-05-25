class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String st=strs[0];
        int i =0;
        while(i < st.length()){
            for(int j =1; j< strs.length;j++){
                if( i>= strs[j].length() || st.charAt(i)!=strs[j].charAt(i)){
                    return st.substring(0,i);
                }
            }
            i++;
        }
        return st;
        
    }
}