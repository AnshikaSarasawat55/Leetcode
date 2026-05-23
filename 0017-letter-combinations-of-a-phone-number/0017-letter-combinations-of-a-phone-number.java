class Solution {
    String[] map={"","","abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        solve(0,digits,ans,"");
        return ans;
        
    }
    public void solve(int index,String digits,List<String> ans,String current){
        if(index == digits.length()){
            ans.add(current);
            return;
        }
        String letter=map[digits.charAt(index) - '0'];
          for (int i = 0;i < letter.length(); i++) {
           current= current + letter.charAt(i);
            solve(index+1,digits,ans,current);
            current= current.substring(0,current.length()-1);
          }
    }
}