import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> st = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a :score){
            st.add(a);
        }
        int size = st.size();
        String arr[]=new String[size];
        int n=0;
        int j=4;
        int count=0;
        while(n!=size){
        int k = st.peek();
        for(int i=0;i<size;i++){
            if(score[i]==k){
                if(count==0){
                    arr[i]="Gold Medal";
                    count++;
                }
                else if(count==1){
                    arr[i]="Silver Medal";
                    count++;
                }
                else if(count==2){
                    arr[i]="Bronze Medal";
                    count++;
                }
                else {
                    arr[i]=Integer.toString(j);
                    j++;
                }
            }
        }
            st.poll();
            n++;
        }
        return arr;
    }
}
