package practice.leetcode30days;

public class MaxSubArray_Day5 {
	public static void main(String[] args) {
		int a [] = {0};
		MaxSubArray_Day5 msa = new MaxSubArray_Day5();
		System.out.println(msa.maxSubArray(a));
	}
public int maxSubArray(int[] nums) {
	int temp=0;
	int max=Math.max(nums[0],Integer.MIN_VALUE);
	for(int i=1;i<nums.length;i++) {
		temp = nums[i]+nums[i-1];
		nums[i] = Math.max(temp, nums[i]);
		max = Math.max(max, nums[i]);		
	}
	return max;
        
    }
	

}
