class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int zerocount=0;
        int maxwindow=0;
        for (int e=0;e<nums.length;e++){
            if (nums[e]==0){
                zerocount++;
                while(zerocount>k){
                    if(nums[s]==0){
                        zerocount--;
                    }
                    s++;
                }
            }
            maxwindow=Math.max(maxwindow,(e-s+1));
        }
        return maxwindow;
    }
}