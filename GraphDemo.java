/**
  Mohammed Raza
  CSC 236 - Lab7 #1(main)
*/

import java.util.*;

public class GraphDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Graph g = new GraphTraverse();

		String input;

		int index;

		System.out.println("enter number of graph elements: ");
		index = keyboard.nextInt();

		System.out.println("enter elements: ");

		for(int i = 0; i < index; i++)
		{
			input = keyboard.next();

			g.insert(input);

		}

		System.out.println("Depth First Traversal: ");
		g.depthFirstTraversal();

		System.out.println();
		System.out.println();

		System.out.println("Breadth First Traversal: ");
		g.breadthFirstTraversal();

		System.out.println();



	}
}
