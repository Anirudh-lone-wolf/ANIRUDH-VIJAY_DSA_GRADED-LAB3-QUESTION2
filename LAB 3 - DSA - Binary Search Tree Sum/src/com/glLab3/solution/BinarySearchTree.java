package com.glLab3.solution;
import java.util.ArrayList;
public class BinarySearchTree {

	public void insertNode(Node root, Node newnode) {
		
		if(newnode.data < root.data) {
			if(root.left == null) {
				root.left = newnode;
			}
			else {
				insertNode(root.left, newnode);
			}
		}
		else {
			if(root.right == null) {
				root.right = newnode;
			}
			else {
				insertNode(root.right, newnode);
			}
		}
		
	}
	
	public ArrayList<Integer> list = new ArrayList<>();

	public void inOrder(Node root) {
		if(root==null)
			return;
		else {
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}
		
	}

	public void findSumPair(int sum) {
		int flag = 0;
		for(int i = 0; i < list.size(); i++) {
			int node1 = list.get(i);
			int node2 = sum - node1;
			if(list.contains(node2)) {
				System.out.println("("+node1+","+node2+")");
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The pair was not found in the binary tree.");
		}
	}
	
	

}
