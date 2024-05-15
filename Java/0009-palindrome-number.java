class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder test = new StringBuilder();
        StringBuilder str = new StringBuilder(String.valueOf(x));

        for(int i = str.length()-1; i >= 0; i--) {
            test.append(str.substring(i, i + 1));
        }

        return test.toString().equals(str.toString());
    }
}