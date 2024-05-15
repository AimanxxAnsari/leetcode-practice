class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String string = "";
        int i = 0;
        while (num > 0) {
            if (num >= values[i]) {
                string = string.concat(roman[i]);
                num = num - values[i];
            } else {
                i++;
            }
        }
        return string.toString();
    }
}

// hashtable solution