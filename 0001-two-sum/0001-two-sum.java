class Solution {
    public int[] twoSum(int[] nums, int target) {
        //array is not sorted & index value matters, cannot sort. Thus, we can not use two pointers.

        Map<Integer,Integer> hmap=new HashMap<>();
        int[] twoSum=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            if(!hmap.containsKey(x))
            hmap.put(nums[i],i);
            else
            {
                twoSum[0]=hmap.get(x);
                twoSum[1]=i;
                return twoSum;
            }
        }

        return null;
    }
}

//TIme: O(n)
//Space:O(n)