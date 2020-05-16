
public class Tree {
	Node rootNode;
	public Tree() {
		rootNode = new Node();
	}
	
	public static void main(String[] args) {
		Tree myTree = new Tree();
		myTree.rootNode.setData("A");
		
		myTree.rootNode.setLeftChild(new Node("W"));
		System.out.println(myTree);
		myTree.rootNode.setMiddleChild(new Node("A"));
		myTree.rootNode.setRightChild(new Node("H"));
		myTree.rootNode.leftChild.setLeftChild(new Node("O"));
		myTree.rootNode.leftChild.setMiddleChild(new Node("O"));
		
		System.out.println(myTree);
		System.out.println(myTree.height());
	}
	
	public String toString() {
		return rootNode.toString();
	}
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			return rootNode.size();
		}
	}
	public int height() {
		if (isEmpty()) {
			return 0;
		} else {
			return height(rootNode);
		}
	}
	public int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(height(n.leftChild), Math.max(height(n.middleChild), height(n.rightChild)));
		}
	}
	public boolean isEmpty() {
		if (rootNode.data == null) {
			return true;
		} else {
			return false;
		}
	}
	
}

class Node {
	Object data;
	Node leftChild;
	Node middleChild;
	Node rightChild;
	
	public Node() {
		
	}
	public Node(Object o) {
		this.data = o;
	}
	public String toString() {
		String returnString = "";
		
		if (rightChild != null) {
			returnString +=rightChild.toString();
		}
		if (middleChild != null) {
			returnString += middleChild.toString();
		}
		if (leftChild != null) {
			returnString += leftChild.toString();
		}
		return returnString+= data.toString();
	}
	public int size() {
		int sum =1; // count 1 for this node
		if (rightChild != null) {
			sum += rightChild.size();
		}
		if (leftChild != null) {
			sum += leftChild.size();
		}
		if (middleChild != null) {
			sum += middleChild.size();
		}
		
		return sum;
	}
	
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * @return the leftChild
	 */
	public Node getLeftChild() {
		return leftChild;
	}
	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	/**
	 * @return the middleChild
	 */
	public Node getMiddleChild() {
		return middleChild;
	}
	/**
	 * @param middleChild the middleChild to set
	 */
	public void setMiddleChild(Node middleChild) {
		this.middleChild = middleChild;
	}
	/**
	 * @return the rightChild
	 */
	public Node getRightChild() {
		return rightChild;
	}
	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
}