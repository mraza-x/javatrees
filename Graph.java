/**
  Mohammed Raza
  CSC 236 - Lab7 #1(class2)
*/
public abstract class Graph
{
	private Node root;

	public Graph()
	{
		root = null;
	}

	public Node getRoot()
	{
		return root;
	}

	public void setRoot(Node theNewNode)
	{
		root = theNewNode;
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public abstract void insert(Comparable item);

	public abstract Node find(Comparable key);


	public void depthFirstTraversal()
	{
		dft(getRoot());
	}

	private void dft(Node t)
	{
		if(t != null)
		{
			System.out.print(t.getValue()); System.out.print(" ");
			dft(t.getLeft());
			dft(t.getRight());
		}
	}

	public void breadthFirstTraversal()
	{
		bft(getRoot());
	}

	private void bft(Node t)
	{
		if(t != null)
		{
			bft(t.getRight());
			System.out.print(t.getValue()); System.out.print(" ");
			bft(t.getLeft());
		}
	}
}