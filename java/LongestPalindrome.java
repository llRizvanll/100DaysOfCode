class LongestPalindrome {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        String maxsubstr = "";
        int maxlen = 0, olen = 0, elen = 0, l = 0;
        for(int i=0; i<arr.length; i++){
            olen = len(arr, i, i);
            elen = len(arr, i, i+1);
            l = Math.max(olen, elen);
            if(l>maxlen){
                int k = (l-1)/2;
                maxsubstr = s.substring(i-k, i+(l/2)+1);
                maxlen = l;
            }
        }
        return maxsubstr;
    }
    private int len(char[] arr, int l, int r){
        while(l>=0 && r<arr.length && arr[l]==arr[r]){
            l--; r++;
        }
        return r-l-1;
    }
}
