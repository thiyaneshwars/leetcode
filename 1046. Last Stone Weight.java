class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a : stones){
            qu.add(a);
        }
        while(qu.size()!=1){
        int a =qu.peek();
        qu.poll();
        int c = a-qu.peek();
        qu.poll();
        qu.add(c);
    }
    return qu.poll();
    }
}
