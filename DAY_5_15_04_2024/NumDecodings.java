class NumDecodings {
    public int numDecodings(String s) {
        if ((s.length() == 0) || (s.charAt(0) == '0'))
            return 0;
        int n = s.length();
        int res[] = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            int singleDigit = Integer.parseInt(s.substring(i - 1, i));
            int doubleDigit = Integer.parseInt(s.substring(i - 2, i));

            if ((singleDigit >= 1) && (singleDigit <= 9))
                res[i] += res[i - 1];

            if ((doubleDigit >= 10) && (doubleDigit <= 26))
                res[i] += res[i - 2];
        }
        return res[n];
    }
}