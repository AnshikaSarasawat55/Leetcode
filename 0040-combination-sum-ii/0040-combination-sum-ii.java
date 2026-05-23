class Solution {
     public List<List<Integer>> combinationSum2(int[] candidates,int target) {
           List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0,target,ans , new ArrayList<>());
        return ans;

        
    }
    public void solve(int[] candidate , int index, int target,List<List<Integer>>ans,List<Integer> current){
      if(target ==0){
        ans.add(new ArrayList<>(current));
        return;
      }
      for(int i =index;i< candidate.length;i++){
          if(candidate[i] > target){
            break;
          }
          if(i>index && candidate[i-1] == candidate[i]){
            continue;
          }
          current.add(candidate[i]);
          solve(candidate,i+1,target-candidate[i],ans,current);
          current.remove(current.size()-1);

      }
    }
}