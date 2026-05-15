class Solution {
    public int myAtoi(String s) {
       
         //usin loop time complexity -o(n)
        long num =0;
        int signed =1;
        int i =0;
        //skip space
        while(i< s.length()&&s.charAt(i) == ' '){
            i++;
          
        }
        // check sign
        if(i<s.length() && (s.charAt(i) == '-'|| s.charAt(i) =='+')){
            if(s.charAt(i) == '-'){
                signed=-1;
                }
            i++;
        
        }
        
        for(;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)){
                break;
            }
            num=num*10+(ch-'0');
            //overflow
             if (signed == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
             if (signed == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) num*signed;
        
      
        

       
    
     }
    }
