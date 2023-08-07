class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int zeroCounter = 0;
        int prod = 1;
        for (int i =0; i < nums.length; ++i){
            prod *= nums[i] != 0 ? nums[i] : 1;
            zeroCounter += nums[i] == 0 ? 1 : 0;
        }
        if (zeroCounter >= 2)
            return res;
        for (int i =0; i < res.length; ++i){
            if (nums[i] == 0){
                res[i] = zeroCounter == 1 ? prod : 0;
            }
            else{
                res[i] = zeroCounter != 0 ? 0 : prod / nums[i];
            }
        }
        return res;
    }
}