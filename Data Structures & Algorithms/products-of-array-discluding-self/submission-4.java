class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int pre = 1, post = 1;
        int len = nums.length;
        int[] res = new int[len];
        while (i < len) {
            res[i] = pre;
            pre *= nums[i];
            i++;
        }
        i--;
        while (i >= 0) {
            res[i] *= post;
            post *= nums[i];
            i--;
        }
        return res;
    }
}  
