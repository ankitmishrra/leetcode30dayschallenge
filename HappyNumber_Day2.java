package practice.leetcode30days;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HappyNumber_Day2 {
	List<Integer> l  = new ArrayList<Integer>();

	public static void main(String[] args) {
		HappyNumber_Day2 hn = new HappyNumber_Day2();	
		int n = 19;
		System.out.println(hn.isHappy(n));
		//System.out.println(Arrays.asList(hn.getDigits(n)));
		
	}
	
	public boolean isHappy(int n) {
		if(l.contains(n)) return false;
		Integer [] arr  = getDigits(n);
		l.add(n);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i]*arr[i];
		}
		if(sum==1) {
			return true;
		}
		return isHappy(sum);
		
		
    }
	
	Integer [] getDigits(int n) {
		List<Integer> l = new ArrayList<Integer>();
		
		while(n/10!=0) {
			l.add(n%10);
			n = n/10;
		}
		l.add(n);
	
		return l.toArray(new Integer[0]);
	}

}
