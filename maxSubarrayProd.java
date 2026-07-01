public class maxSubarrayProd {
    public int maxProduct(int[] nums) {
        int mprod = nums[0];
        int miprod = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = mprod;
                mprod = miprod;
                miprod = temp;
            }
            mprod = Math.max(nums[i], mprod * nums[i]);
            miprod = Math.min(nums[i], miprod * nums[i]);

            ans = Math.max(ans, mprod);
        }
        return ans;
    }
}
