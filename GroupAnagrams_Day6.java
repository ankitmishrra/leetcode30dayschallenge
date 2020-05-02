package practice.leetcode30days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams_Day6 {
	
	public static void main(String[] args) {
			String str = "cde";
			
	}
		public List<List<String>> groupAnagrams(String[] strs) {
			Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
			
			for (String str : strs) {
				String sorted = sort(str);
				if(map.containsKey(sorted)) {
					map.get(sorted).add(str);
				}else {
					ArrayList<String> l = new ArrayList<String>();
					l.add(str);
					map.put(sorted, l);
				}
			}
			
			List<List<String>> a  = new ArrayList<List<String>>(map.values());
			
			return a;
	        
	    }
	
	
		String sort(String s) {
			
			 // convert input string to char array 
	        char tempArray[] = s.toCharArray(); 
	        // sort tempArray 
	        Arrays.sort(tempArray); 
			return new String(tempArray);
			
		}
}
