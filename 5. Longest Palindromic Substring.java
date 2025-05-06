class Solution {
    public String longestPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        char arr[] = s.toCharArray();
        int start = 0;
        int temp = 0;
        int i = 0;

        if (s.length() <= 1) {
            return s;
        }

        while (i < s.length()) {
            for (int j = i; j < s.length(); j++) {
                int left = i;
                int right = j;
                boolean isPalindrome = true;
                while (left < right) {
                    if (arr[left] != arr[right]) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome && (j - i) > temp) {
                    start = i;
                    temp = j - i;
                }
            }
            i++;
        }

        for (int k = start; k <= start + temp; k++) {
            string.append(arr[k]);
        }

        return string.toString();
    }
}
