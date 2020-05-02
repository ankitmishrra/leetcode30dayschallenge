package practice.leetcode30days;

import java.util.Arrays;

public class MoveZeros_Day3 {
public static void main(String[] args) {
	MoveZeros_Day3 mz = new MoveZeros_Day3();
	int [] nums = {0,1,0,3,12};
		mz.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
}
public void moveZeroes(int[] nums) {
    int i=0,k=0;
    if(nums.length==1) return;
    for(;i<nums.length;i++) {
    	if(nums[i]!=0) {
    		nums[k++]=nums[i];
    		if(k-1!=i)
    		nums[i]=0;
    	}
    }
}

}
