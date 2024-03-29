class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=1;i<heights.length;i++){
            int diff = heights[i]- heights[i-1];
            if(diff>0){  
            if(pq.size()<ladders){
                pq.offer(diff);
            }else{ 
            int b = diff;
            if(pq.size()>0 && pq.peek()<diff){
                b = pq.remove();
                pq.offer(diff);
            }
            if(bricks-b>=0){
                bricks-= b;
            }else{
                return i-1;
            }

            }

            }

        }
          return heights.length-1;
    }
}