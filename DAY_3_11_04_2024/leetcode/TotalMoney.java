class TotalMoney {
    public int totalMoney(int n) {
        int sum = 0, remainder = 0, number = 0, t = 0;
        if (n == 0)
            return 0;
        else {
            number = n / 7;
            remainder = n % 7;

            if (n < 7) {
                for (int i = 0; i <= n; i++) {
                    sum += i;
                }
            } else {
                for (int k = 1; k <= number; k++) {
                    t = k;
                    int j = 1;
                    while (j <= 7) {
                        sum += t;
                        t++;
                        j++;
                    }
                }
                System.out.println(t);
                t = n / 7 + 1;
                System.out.println(t);
                for (int i = 0; i < remainder; i++) {

                    sum += t;
                    t++;

                }

            }

        }
        return sum;
    }
}