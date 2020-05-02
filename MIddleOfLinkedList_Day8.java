package practice.leetcode30days;


//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 

public class MIddleOfLinkedList_Day8{
	public static void main(String[] args) {
		
	}
	
public ListNode middleNode(ListNode head) {
	ListNode temp1=head,temp2=head;
	while(temp2!=null && temp2.next!=null) {
		temp1 = temp1.next;
		temp2 = temp2.next.next;
	}
	return temp1;
        
    }
}
