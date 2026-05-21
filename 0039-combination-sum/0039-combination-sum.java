class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(candidates, 0,target,ans , new ArrayList<>());
        return ans;

        
    }
    public void solve(int[] candidate , int index, int target,List<List<Integer>>ans,List<Integer> current){
        if(target ==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if( target <0|| index == candidate.length){
            return;
        }
        // add
        current.add(candidate[index]);
        solve(candidate,index,target-candidate[index],ans,current);
        // backtrack
        current.remove(current.size()-1);
        solve(candidate, index+1,target,ans,current);

    }
}