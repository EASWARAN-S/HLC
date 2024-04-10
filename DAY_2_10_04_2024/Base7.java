class Base7 {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        String result = "";
        if (num < 0) {
            num = Math.abs(num);
            result += "-";
        }
        List<Integer> arr = new ArrayList<>();
        while (num != 0) {
            arr.add(num % 7);
            num = num / 7;
        }

        for (int i = arr.size() - 1; i >= 0; i--)
            result += arr.get(i);
        return result;
    }
}