package java;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] new_arr = new int[nums.length];
        int right = 1;
        new_arr[0] = 1;
        
        
        // find the left part
        for(int i = 1; i < nums.length;i++){
            new_arr[i] = new_arr[i-1]*nums[i-1];
        }
        
        
        //find the right part
        for(int i = nums.length-1;i>=0;i--){
            new_arr[i]*=right;
            right*=nums[i];
        }
        return new_arr;
    }
}
