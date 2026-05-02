class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(cardPoints.length ==0){
            return 0;
        }
        int r =cardPoints.length-k;
        int l = -1;
        int sum =0;
        int max=0;
        for(int i =r;i<cardPoints.length;i++){
            sum +=cardPoints[i];
            max =sum;
        }
        while(r < cardPoints.length){
            sum -=cardPoints[r];
            r++;
            l++;
            sum +=cardPoints[l];
            max=Math.max(max,sum);
        }
        return max;
    }
}