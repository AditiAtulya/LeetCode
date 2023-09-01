class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=noofone(i);
        }
        return ans;
    }
    public static int noofone(int i){
        String val=Integer.toBinaryString(i);
        int count=0;
        for(int j=0;j<val.length();j++){
            if(val.charAt(j)=='1')
                count++;
        }
        return count;
    }
}