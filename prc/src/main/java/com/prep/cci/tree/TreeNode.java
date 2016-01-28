package com.prep.cci.tree;


public class TreeNode<K extends Comparable<K>, V> {
	K key;
	V val;
	TreeNode leftNode;
	TreeNode rightNode;
	int count;

	public TreeNode() {
	}

	public TreeNode(K key, V val) {
		this.key = key;
		this.val = val;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getVal() {
		return val;
	}

	public void setVal(V val) {
		this.val = val;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", val=" + val + "]";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}