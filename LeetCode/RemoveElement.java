class Solution {
    public int removeElement(int[] nums, int val) {
        int ind=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                c++;
                nums[ind++]=nums[i];
            }
        }
        return c;
    }
}
