class Solution {
    String[] map={"","","abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        solve(0,digits,ans,new StringBuilder());
        return ans;
        
    }
    public void solve(int index,String digits,List<String> ans,StringBuilder current){
        if(index == digits.length()){
            ans.add(current.toString());
            return;
        }
        String letter=map[digits.charAt(index) - '0'];
          for (int i = 0;i < letter.length(); i++) {
            current.append(letter.charAt(i));
            solve(index+1,digits,ans,current);
             current.deleteCharAt(current.length()-1);
          }
    }
}