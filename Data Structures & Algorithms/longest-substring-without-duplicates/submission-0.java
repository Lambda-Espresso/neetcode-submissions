class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) return 0;
        if (len == 1) return 1;
        int cur = 1;
        int res = cur;
        int l = 0, r = 1;
        Set<Character> set = new HashSet<>();
        char c1 = s.charAt(l); char c2;
        set.add(c1);
        while (r < len) {
            c2 = s.charAt(r);
            if (!set.contains(c2)) {
                set.add(c2);
                cur++;
                res = Math.max(res, cur);
                r++;
            } else {
                l++;
                if (l == r) {
                    r++;
                    cur = 1;
                } else {
                    cur--;
                    set.remove(c1);
                }
                c1 = s.charAt(l);
            }
        }
        return res;
    }
}
