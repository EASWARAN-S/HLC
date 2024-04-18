class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] == nums[k])
                    j++;
            }
        }
        return j;
    }
}