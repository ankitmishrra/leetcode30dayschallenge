package practice.leetcode30days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingElements_Day7 {

		public static void main(String[] args) {
			int [] arr = {1,2,3};
			CountingElements_Day7 ce = new CountingElements_Day7();
			System.out.println(ce.countElements(arr));
		}
		
		public int countElements(int[] arr) {
			int counter=0;
	       Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	       
	       Arrays.sort(arr);
	       for(int i=arr.length-1;i>=0;i--) {
	    	   if(map.containsKey(arr[i]+1)) {
	    		   counter+=1;	    		  
	    	   }
	    	   map.put(arr[i],true);
	       }
	       
	       return counter;
	       
	    }
}
