class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getKey() - a.getKey());
        for(int i=0; i<k; i++){
            pq.add(new Pair<Integer, Integer>(nums[i], i));
        }

        int[] ans = new int[nums.length-k+1];
        ans[0] = pq.peek().getKey();
        for(int i=k; i<nums.length; i++){
            pq.add(new Pair<Integer, Integer>(nums[i], i));
            while(!pq.isEmpty() && pq.peek().getValue() <= i-k){
                pq.poll();
            }

            ans[i-k+1] = pq.peek().getKey(); 
        }

        return ans;
    }
}