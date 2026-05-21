class Solution {
    public int countGoodNumbers(long n) {
    long mod =(long)1e9 +7;
    long even = (n +1)/2;
    long odd = n/2;
    long ans = (power(5 ,even)*power(4,odd))%mod;
    return (int) ans;
        
    }
    public long power(long x,long n){
         long mod =(long)1e9 +7;
        if(n==0){
            return 1;
        }
        long half=power(x ,n/2);
        if(n%2 == 0){
            return (half * half )% mod;

        }
        else if(n%2 ==1){
            return ((half*half %mod)*x )%mod;
        }
        return 0;

        
    }
}