class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        reverse(st);
        return String.join(" ",st);
        
    }
    public void reverse(String[] st){
    int l =0;
    int r=st.length-1;
    while(l<r){
        String temp =st[l];
        st[l]=st[r];
        st[r]=temp;
        l++;
        r--;
    }
    }
}