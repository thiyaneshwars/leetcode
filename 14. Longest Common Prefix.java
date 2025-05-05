class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        StringBuilder string = new StringBuilder();

        if (strs.length == 0) {
            return "";
        }

        char ch1[] = strs[0].toCharArray();
        int i = 0;
        boolean n = true;

        while (n != false) {
            if (i >= ch1.length) {
                break;
            }

            char ch = ch1[i];
            for (int j = 1; j < strs.length; j++) {
                char ch2[] = strs[j].toCharArray();
                if (i >= ch2.length || ch != ch2[i]) {
                    ch = '0';
                    n = false;
                    break;
                }
            }

            if (ch != '0') {
                count++;
                string.append(ch);
            }

            i++;
        }

        if (count == 0) {
            return "";
        } else {
            return string.toString();
        }
    }
}
