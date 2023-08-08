class Solution {
    public int search(int[] nums, int target) {
     int n=nums.length;
     int lo=0;
     int hi=n-1;
     int ans=0;
     while(lo<=hi){
         int mid=(lo+hi)/2;
         if(nums[mid]>=nums[0]){
             ans=mid;
             lo=mid+1;
         }else{
             hi=mid-1;
         }
     }
    int low=0;
    int high=0;
    System.out.println(ans);
    if(target>=nums[0]&&target<=nums[ans]){
        low=0;
        high=ans;
    }else{
        low=ans+1;
        high=n-1;
    }
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
return -1;
}
}