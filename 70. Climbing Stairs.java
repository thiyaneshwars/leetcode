class Solution {
    public int climbStairs(int n) {
           if(n<=3){
            return n;
        }
        else{
            PriorityQueue<Integer> al=new PriorityQueue<>();
            al.add(1);
            al.add(1);
            for(int i=2;i<n;i++){
                int a = al.poll();
                int b=al.peek();
                int c = a+b;
                al.add(c);
            }
            return (al.poll()+al.peek());
        }
    }
}
