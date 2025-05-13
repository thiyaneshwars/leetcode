class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;

        long[] freq = new long[26]; 

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int step = 0; step < t; step++) {
            long[] next = new long[26];

            for (int i = 0; i < 26; i++) {
                if (i == 25) { 
                    next[0] = (next[0] + freq[i]) % MOD;
                    next[1] = (next[1] + freq[i]) % MOD;
                } else {
                    next[i + 1] = (next[i + 1] + freq[i]) % MOD;
                }
            }

            freq = next;
        }

        long result = 0;
        for (long f : freq) {
            result = (result + f) % MOD;
        }

        return (int) result;
    }
}
