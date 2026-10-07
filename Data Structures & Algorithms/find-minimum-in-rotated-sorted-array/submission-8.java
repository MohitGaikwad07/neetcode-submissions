class Solution {
    public int findMin(int[] nums) {
        // int low = 0;
        // int high = nums.length-1;
        // int min = nums[0];
        // for(int num:nums){
        //     if(num<min) min=num;
        // }
        // while(low<high){
        //     int mid = low+(high - low)/2;

        //     if(mid == min) return mid;
        //     else if(min<mid) high = mid-1;
        //     else low = mid+1;
        // }
        // return -1;
        int min =Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min) min = num;
        }
        return min;
    }
}
