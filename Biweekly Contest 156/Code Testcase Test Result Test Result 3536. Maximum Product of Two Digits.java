class Solution {
    public int maxProduct(int n) {
        int temp=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(n!=0){
            int a = n%10;
            al.add(a);
            n/=10;
        }
        int arr[]=new int[al.size()];
        int j=0;
        for(int i=al.size()-1;i>=0;i--){
            arr[i]=al.get(j);
            j++;
        }
        al.clear();
        for(int i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
            int t = arr[i]*arr[j];
            if(t>temp){
                temp=0;
                temp=t;
            }
        }
    }
        return temp;
    }
}
