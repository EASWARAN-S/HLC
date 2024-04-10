class ToLowerCase {
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            j = str[i];
            if (64 < j && j < 91) {
                j += 32;
            }
            str[i] = (char) j;
        }
        return new String(str);
    }
}