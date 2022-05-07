class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int number: nums2){
            if(set1.contains(number)){
                set2.add(number);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num: set2){
            result[i] = num;
            i++;
        }
        return result;
    }
}
