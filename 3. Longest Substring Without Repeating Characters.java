class Solution {
    public int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        int i = 0, j = 0, t = 0;

        while (i < s.length()) {
            int count = 0;
            int flag = 0;

            if (j < 1) {
                count++;
                t = Math.max(t, count);
            } else {
                int temp = i;
                while (temp < j) {
                    if (j != s.length() && arr[temp] == arr[j]) {
                        flag = 1;
                        break;
                    }
                    temp++;
                }

                if (flag == 0 && j < s.length()) {
                    count = j - i + 1;
                    t = Math.max(t, count);
                }
            }

            if (flag == 1 || j == s.length()) {
                i++;
                j = i;
            } else {
                j++;
            }
        }

        return t;
    }
}
