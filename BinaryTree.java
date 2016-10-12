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


	public void preorder()
	{
		doPreorder(getRoot());
	}

	private void doPreorder(Node t)
	{
		if(t != null)
		{
			System.out.print(t.getValue()); System.out.print(" ");
			doPreorder(t.getLeft());
			doPreorder(t.getRight());
		}
	}


	public void inorder()
	{
		doInorder(getRoot());
	}

	private void doInorder(Node t)
	{
		if(t != null)
		{
			doInorder(t.getLeft());
			System.out.print(t.getValue()); System.out.println(" ");
			doInorder(t.getRight());
		}
	}


	public void postorder()
	{
		doPostorder(getRoot());
	}

	private void doPostorder(Node t)
	{
		if(t != null)
		{
			doPostorder(t.getLeft());
			doPostorder(t.getRight());
			System.out.print(t.getValue()); System.out.print(" ");
		}
	}


	public void order()
	{
		doOrder(getRoot());
	}

	private void doOrder(Node t)
	{
		if(t != null)
		{
			doOrder(t.getRight());
			System.out.print(t.getValue()); System.out.print(" ");
			doOrder(t.getLeft());

		}
	}










}