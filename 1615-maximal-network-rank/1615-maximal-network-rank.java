class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int max = 0;

        for(int i = 0; i < n; i++)
            for(int k = 0; k < n; k++){
                if(i == k)
                    continue;

                int count = 0;

                for(int j = 0; j < roads.length; j++){
                    if((i == roads[j][0] || i == roads[j][1] || k == roads[j][0] || k == roads[j][1]))
                            count++;

                    max = Math.max(count, max);
                }
            }

        return max;
    }
}