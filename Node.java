/**
  Mohammed Raza
  CSC 236 - Lab7 #1(class1)
*/

public class Node
{
	private Object value;
	private Node left, right;

	public Node(Object initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}

	public Node(Object initValue, Node initLeft, Node initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}

	public Object getValue()
	{
		return value;
	}

	public Node getLeft()
	{
		return left;
	}

	public Node getRight()
	{
		return right;
	}

	public void setValue(Object theNewValue)
	{
		value = theNewValue;
	}

	public void setLeft(Node theNewLeft)
	{
		left = theNewLeft;
	}

	public void setRight(Node theNewRight)
	{
		right = theNewRight;
	}

}