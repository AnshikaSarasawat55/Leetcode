class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> heap= new PriorityQueue<>();

        for (int num : arr) {
           heap.add(num);
        }
        HashMap<Integer, Integer> map= new HashMap<>();
        int i =1;
        while(!heap.isEmpty()){
            if(!map.containsKey(heap.peek())){
                map.put(heap.poll(),i);
                i++;
            }
            else{
                int val= heap.remove();
                map.put(val,map.get(val));
            }


        }
 
        
        for(int j =0;j< arr.length;j++){
            arr[j]=map.get(arr[j]);
        }
        return arr;
        
     }
}