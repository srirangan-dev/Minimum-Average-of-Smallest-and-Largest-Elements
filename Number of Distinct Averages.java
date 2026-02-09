class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=nums.length-1;

        Set <Double> seen=new HashSet<>();

        while(left<right){
            double avg=(nums[left]+nums[right])/2.0;
            seen.add(avg);

            left++;
            right--;

        }
        
        return seen.size();
    }
}
