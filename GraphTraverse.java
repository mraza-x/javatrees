/**
  Mohammed Raza
  CSC 236 - Lab7 #1(class3)
*/

public class GraphTraverse extends Graph
{
	public void insert(Comparable item)
	{
		setRoot(recurInsert(getRoot(),item));
	}

	private Node recurInsert(Node t, Comparable item)
	{
		if(t == null)
			return new Node(item);
		else if(item.compareTo(t.getValue()) < 0)
			t.setLeft(recurInsert(t.getLeft(), item));
		else
			t.setRight(recurInsert(t.getRight(),item));
		return t;
	}

	public Node find(Comparable key)
	{
		Node p = getRoot();
		while(p != null && key.compareTo(p.getValue()) != 0)
		{
			if(key.compareTo(p.getValue()) < 0)
				p = p.getLeft();
			else
				p = p.getRight();
		}

		return p;
	}


}


