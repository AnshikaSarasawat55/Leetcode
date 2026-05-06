class Solution {
     public int subarraysWithKDistinct(int[] nums, int k) {
     return goodSubarray(nums,k) - goodSubarray(nums,k-1);
    }
    public int goodSubarray(int[] nums,int k){
          int l=0;
        int r=0;
        int cnt=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);

                }
                l++;
            }
            if(map.size() <= k){
                cnt += r-l;
            }
            r++;
        }
        return cnt;
    }
  
}