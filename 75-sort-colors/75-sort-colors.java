class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
              swap(nums,low++,mid++);
            else if(nums[mid]==2)
                 swap(nums,high--,mid);
            else
                mid++;
        }
    
    }
        public void swap(int[] nums, int i, int j) {
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
      }
}


//Using Dutch National Flag Algorithm.!