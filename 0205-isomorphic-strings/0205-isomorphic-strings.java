class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
      int[] maps=new int[256];
      int[] mapt=new int[256];
      for(int i =0;i<s.length();i++){
        char ch =s.charAt(i);
        char ch2 =t.charAt(i);
        if(maps[ch] != mapt[ch2]){
            return false;
        }
        maps[ch] = i+1;
        mapt[ch2]=i+1;

      } 
      return true;
         }
}