We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
    
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());
        for(Integer i: stones){
            prq.add(i);
        }
        int first=0, second =0;
        while(prq.size()>1){
            first = prq.remove();
            second = prq.remove();
            if(first!=second) prq.add(first-second);
        }
        return prq.isEmpty() ? 0 : prq.remove();
    }
}
