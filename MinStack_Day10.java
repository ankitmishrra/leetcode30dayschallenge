package practice.leetcode30days;

import java.util.ArrayList;


public class MinStack_Day10 {
	public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(2147483646);
		ms.push(2147483646);
		ms.push(2147483647);
		ms.top();
		ms.pop();
		ms.getMin();
		ms.pop();
		ms.getMin();
		ms.pop();
		ms.push(2147483647);
		ms.top();
		ms.getMin();
	//	ms.push();
		ms.pop();
		ms.getMin();
	}

}

class MinStack {
    ArrayList<Integer> stack ;
    ArrayList<Integer> sorted;
    int min=Integer.MAX_VALUE;
    
    
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<Integer>();
        sorted = new ArrayList<Integer>();
    }
    
    public void push(int x) {
    	min = Math.min(x, min);
    	int i=0;
    
    	for(;i<sorted.size();i++) {
    		if(x<sorted.get(i)) {
    			sorted.add(i, x);
    			break;
    		}
    	}
    	if(i==sorted.size()|| sorted.isEmpty()) sorted.add(x);
        stack.add(x);
    }
    
    public void pop() {
    	int x;
    	if(!stack.isEmpty()) {
    		x = stack.remove(stack.size()-1);
    		sorted.remove(sorted.indexOf(x));
    	}
    	if(!sorted.isEmpty())
    	min = sorted.get(0);
        
    }
    
    public int top() {
    	
        return stack.get(stack.size()-1).intValue();
		
    }
    
    public int getMin() {
    	
        return min;
    }
}