package practice.leetcode30days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight_Day12 {
	public static void main(String[] args) {
		LastStoneWeight_Day12 lsw = new LastStoneWeight_Day12();
		
		int [] stones = {2,4};
	
		System.out.println(lsw.lastStoneWeight(stones));
	}
	public int lastStoneWeight(int[] stones) {
		/**
		 * To solve the given problem, the approach is to use the Max Heap DataStructure, because we need to 
		 * continuously modify the DS by picking up the top 2 max elements (root is the max element case of max heap) and adding their difference if greater than 1.
		 * The heap rearranges itself while any modification is made to it
		 * */
		
		//Max Heap dataStructure can be simulated using Priority queue
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder()); //reverse.order => Change the by default Min heap nature of PQ to Max heap
		for(int i=0;i<stones.length;i++) {
			q.add(stones[i]);
		}
		while(q.size()>1) {
			//The root of a max heap is the maximum element present. Take the top 2 max elements and add their
			// difference to the queue
			int max1 = q.poll();
			int max2 = q.poll();
			if((max1-max2)>0) q.add(max1-max2);
		}
		//return the single element left or 0
        return q.size()==1?q.peek():0;
    }

}
