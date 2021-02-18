class Solution {
    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int count = 0;
        
        for (int i = 0; i < s.length();i++){
            char[] c = s.toCharArray();
            
            if (c[i] == 'L') count++;
            else if(c[i] == 'R') count--;
            
            if (count == 0)
                balancedCount++;
        }
        
        return balancedCount;
    }
}
