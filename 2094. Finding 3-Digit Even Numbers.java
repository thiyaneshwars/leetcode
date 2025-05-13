class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        int hundreds = digits[i];
                        int tens = digits[j];
                        int ones = digits[k];
                   
                        if (hundreds != 0 && ones % 2 == 0) { 
                            int num = hundreds * 100 + tens * 10 + ones;
                            System.out.println(num);
                            hs.add(num);
                        }
                    }
                }
            }
        }

        int[] result = new int[hs.size()];
        int idx = 0;
        for (int num : hs) {
            result[idx++] = num;
        }

        Arrays.sort(result);
        return result;
    }
}
