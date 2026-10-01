class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            int leftPart = i * nums[i] - leftSum;
            int rightPart = rightSum - (n - i - 1) * nums[i];
            
            result[i] = leftPart + rightPart;
            
            leftSum += nums[i];
        }
        
        return result;
    }
}