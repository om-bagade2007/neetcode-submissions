class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, j=i+1,sum=0;
        while(i<nums.length){
            sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }
            else if(j<nums.length-1){
                j++;
            }
            else{
                i++;
                j=i+1;
            }
        }
        return new int[]{i,j};
    }
}
