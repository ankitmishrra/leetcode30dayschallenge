package practice.leetcode30days;

import java.util.Arrays;
import java.util.Stack;

public class BackSpaceStringCompare_Day9 {
	public static void main(String[] args) {
		BackSpaceStringCompare_Day9 bsc  = new BackSpaceStringCompare_Day9();
		String S = "#";
		String T= "#";
		System.out.println(bsc.backspaceCompare(S, T));
		
	}
	
	public boolean backspaceCompare(String S, String T) {
		
		S = getProcessedString(S);
		T = getProcessedString(T);
     
		return S.equals(T);   
    }
	
	public String getProcessedString(String s){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			if(temp=='#') {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				
			}else {
				stack.push(temp);				
			}
		}
		String returnString="";
		if(!stack.isEmpty())
		returnString = Arrays.toString(stack.toArray());
		return returnString;
		
	}

}
