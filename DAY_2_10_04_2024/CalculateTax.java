class CalculateTax {
    public double calculateTax(int[][] brackets, int income) {
        int count = 0;
        double tax = 0;
        int difference = 0;
        if (income == 0)
            return tax;
        if (brackets[0][0] > income) {
            tax = income * (brackets[0][1] / 100.00);
            return tax;
        }

        else {
            tax = (brackets[0][0] * (brackets[0][1])) / 100.00;

            for (int i = 1; i < brackets.length; i++) {

                if (brackets[i][0] > income) {
                    brackets[i][0] = income;
                    difference = brackets[i][0] - brackets[i - 1][0];
                    tax += (difference * brackets[i][1]) / 100.00;
                    break;
                } else {
                    difference = brackets[i][0] - brackets[i - 1][0];
                    tax += (difference * brackets[i][1]) / 100.00;
                }

            }
            return tax;
        }
    }
}