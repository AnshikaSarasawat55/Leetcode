class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,ans ,new ArrayList<>());
        return ans;
        
    }
    public void solve(int[] nums, int index, List<List<Integer>>ans, List<Integer> current){
        ans.add(new ArrayList<>(current));
        for(int i = index;i< nums.length;i++){
            if(i> index && nums[i] == nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            solve(nums, i+1 ,ans,current);
            current.remove(current.size()-1);
        }
    }
}