
public class MaximumWealth {

    public int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            sum[i] = total;
        }
        int max = 0;
        for (int k = 0; k < sum.length; k++) {
            if (max <= sum[k])
                max = sum[k];
        }
        return max;
    }

}