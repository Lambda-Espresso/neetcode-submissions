class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int len = 0;
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                len = 0;
                while (set.contains(num + len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
