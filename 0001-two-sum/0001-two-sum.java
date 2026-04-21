class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(hashmap.containsKey(target-num)){
                return new int[] {i,hashmap.get(target-num)};
            }
            hashmap.put(num,i);
        } 
         return new int[] {};

       
        
    }
}