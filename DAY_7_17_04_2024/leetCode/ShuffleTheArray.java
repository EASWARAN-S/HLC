public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                res[i] = nums[k];
                k++;
            } else {
                res[i] = nums[n];
                n++;
            }

        }
        return res;
    }
}
