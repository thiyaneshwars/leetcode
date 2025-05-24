class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target||nums[i]>target){
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==0){
            index=nums.length;
        }
        return index;
    }
}
