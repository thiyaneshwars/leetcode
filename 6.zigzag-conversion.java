class Solution {
    public String convert(String s, int row) {
        if (row == 1 || s.length() <= row) return s;

        int num[] = new int[s.length()];
        int i = 0;
        while (i != s.length()) {
            int j = 0;
            while (j != row) {
                if (i != s.length()) {
                    num[i] = j;
                    i++;
                    j++;
                } else {
                    break;
                }
            }
            if (j == row) {
                int a = row - 2;
                while (a != 0) {
                    if (i != s.length()) {
                        num[i] = a;
                        i++;
                        a--;
                    } else {
                        break;
                    }
                }
            }
        }

        char arr[] = s.toCharArray();
        int k = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (k != row) {
            for (i = 0; i < s.length(); i++) {
                if (num[i] == j) {
                    sb.append(arr[i]);
                }
            }
            k++;
            j++;
        }

        return sb.toString();
    }
}
