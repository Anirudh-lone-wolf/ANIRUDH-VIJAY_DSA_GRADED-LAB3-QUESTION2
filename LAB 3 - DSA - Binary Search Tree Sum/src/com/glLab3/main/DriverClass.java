package com.glLab3.main;

import java.util.Scanner;

import com.glLab3.solution.BinarySearchTree;
import com.glLab3.solution.Node;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BinarySearchTree bst = new BinarySearchTree();
		
		Node root = null;
		Node newnode = null;
		
		System.out.println("Enter the number of nodes in the binary search tree : ");
		int noOfNodes = sc.nextInt();
		for(int i = 1; i <= noOfNodes; i++) {
			System.out.println("Enter the data of the node "+i+" : ");
			int data = sc.nextInt();
			newnode = new Node(data);
			if(root==null)
				root = newnode;
			else
				bst.insertNode(root, newnode);
		}
		
		bst.inOrder(root);
		System.out.println(bst.list);
		
		System.out.print("Sum = ");
		int sum = sc.nextInt();
		System.out.println();
		
		System.out.println("The node pair for the given sum is : ");
		bst.findSumPair(sum);
		
		sc.close();
	}

}
