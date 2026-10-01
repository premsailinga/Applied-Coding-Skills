class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r = nums.length-1;
        int i = nums.length-1;
        int[] result = new int[nums.length];
        while (l <= r) {
            int leftSquare = nums[l] * nums[l];
            int rightSquare = nums[r] * nums[r];
            
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                l++;
            } else {
                result[i] = rightSquare;
                r--;
            }
            i--;
        }
        
        return result;
    }
        
    }
