class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length*2];
        for(int i = 0; i<2*nums.length; i++){
            arr[i] = nums[i%nums.length];
        }
        return arr;
    }
}