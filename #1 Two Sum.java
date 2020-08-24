class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int sum=0;
        int length=nums.length;
        for(int i=0;i<length-1;i++)
        {
            sum=nums[i]+nums[i+1];
            if(sum==target)
            {
            res[0]=i;
                res[1]=i+1;
            }
        }
        return res;
    }
}
