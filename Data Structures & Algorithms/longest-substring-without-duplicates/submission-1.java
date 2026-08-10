class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) return 0;
        if (len == 1) return 1;
        int res = 0;
        int l = 0, r = 0;
        Set<Character> set = new HashSet<>();
        while (r < len) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r++));
                res = Math.max(res, r-l);
            } else {
                set.remove(s.charAt(l++));
            }
        }
        return res;
    }
}
