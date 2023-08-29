class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] ans=new int[nums.length];

      int l=0,r=nums.length-1,i=nums.length-1;

      while(r>=l)
      {
          if(nums[l]*nums[l]>=nums[r]*nums[r])
          {
              ans[i]=nums[l]*nums[l];
              i--;
              l++;
          }
          else
          {
            ans[i]=nums[r]*nums[r];
              i--;
              r--;  
          }
      } 

      return ans; 
    }
}