package practice.leetcode30days;

public class BinaryTreeDiameter_Day11 {
	
	
	
	
	public static void main(String[] args) {
		Solution bt = new Solution();
		
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		//tn1.left = tn2;
		tn4.left =tn2;
		tn2.left=tn3;
		tn2.right=tn1;
		tn1.left=tn5;
		System.out.println(bt.diameterOfBinaryTree(tn4));
		
	}
	//bt.height();
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }	
 
class Solution {
	int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    	if(root==null) return 0;
    	
    	
    	int hl = height(root);
    	//int hr = height(root.right,res);
    	
    	return res;
    	
    	
    }
    
    public int height(TreeNode node){
    	if(node==null) {
    		return -1;
    	}
    	int hl = height(node.left);
    	int hr = height(node.right);
    	res = Math.max(res,hl+hr+2);
    	
    	return 1+Math.max(hl,hr);
    	
    }
}