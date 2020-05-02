package practice.leetcode30days;

import java.util.HashMap;
import java.util.Map;

public class ContiguosSubArray_Day13 {
	public static void main(String[] args) {
		ContiguosSubArray_Day13 csa = new ContiguosSubArray_Day13();
		int []  nums = {1,1,0,0,1};
		System.out.println(csa.findMaxLength(nums));
		
	}
	
	public int findMaxLength(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0, -1);
		int sum=0,maxLen=0;
		
		for(int i=0;i<nums.length;i++) {
			 if (nums[i] == 0) {
	                sum -= 1;
	            } else {
	                sum += 1;
	            }
			 if(map.get(sum)!=null) {
				 maxLen = Math.max(maxLen,i-map.get(sum));
			 }else {
				  map.put(sum, i);
			 }
			
		}
     
	return maxLen;
    }

}
