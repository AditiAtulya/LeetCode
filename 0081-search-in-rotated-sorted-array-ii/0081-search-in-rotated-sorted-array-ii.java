class Solution {
    public boolean search(int[] nums, int target) {
        int i=0,j=nums.length-1;
       while(i<=j){
            if(nums[i]==target|| nums[j]==target) return true;
            else if(target< nums[i] && nums[j]< target) return false;
            i++;
            j--;
        }
     return false;
        
    }
}