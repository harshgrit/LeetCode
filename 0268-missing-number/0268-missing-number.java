class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=n*(n+1)/2;
        
        int temp=0;
        
        for(int num:nums)
        {
            temp+=num;
        }
        
        return sum-temp;
    }
}