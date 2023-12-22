class Solution {
    public int maxScore(String s) {
        int res = 0;
		int zero = 0;
		int ones = 0;
		char[] c= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '1') {
				
				ones = ones + 1;
			}
		}

		for (int i = 0; i < c.length-1; i++) {
			if (c[i] == '0') {
				zero = zero + 1;
			} else {
				ones = ones - 1;
			}
			res = Math.max(res,zero+ones);
		}
		return res;
    }
}