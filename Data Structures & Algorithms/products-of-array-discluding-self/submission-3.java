class Solution {
    public int[] productExceptSelf(int[] nums) {
        int all = 1;
        int exceptZero = 1;
        int zeroCount = 0;
        for (int num : nums) {
            all *= num;
            if (num != 0) {
                exceptZero *= num;
            }
            if (num == 0) {
                zeroCount++;
                if (zeroCount == 2) return new int[nums.length];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] != 0) ? all/nums[i] : exceptZero;
        }
        return nums;
    }
}  
