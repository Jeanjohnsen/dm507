/*
 * 
 * Jean Ramon Johnsen - jejoh16
 *
 * */
class DictBinTree implements Dict{
	int size;
	int counter;
	Node root;

	public void insert(int k)
	{
		//Create a new node with the given key
		Node z = new Node(k);

		//Create temporary nodes to store nodes from the tree
		Node y = null;
		Node x = root;

		//Loop through the tree and find the right place for z
		while(x != null)
		{
			y = x;
			if(z.key < x.key)
				x = x.left;
			else
				x = x.right;
		}

		//Check if there is a root or where the node z should be placed
		if(y == null)
			root = z;
		else if(z.key < y.key)
			y.left = z;
		else
			y.right = z;

		size++;
	}
  public int[] orderedTraversal()
	{
		int[] arr = new int[size];

		//reset the counter before doing the traversal
		counter = 0;

		arr = orderedTraversalHelper(root, arr);

		return arr;
	}
	private int[] orderedTraversalHelper(Node x, int[] arr)
	{
		//run the code if the node exists
		if(x != null)
		{
			orderedTraversalHelper(x.left, arr);
			arr[counter] = x.key;
			counter++;
			orderedTraversalHelper(x.right, arr);
		}

		return arr;
	}
  public boolean search(int k)
	{
		return searchHelper(root, k);
	}
	private boolean searchHelper(Node x, int k)
	{
		//Check if k exists in the tree
		if(x == null)
			return false;
		else if(k == x.key)
			return true;

		//Run the function again if the above checks doesn't apply to the parameters
		if(k < x.key)
			return searchHelper(x.left, k);
		else
			return searchHelper(x.right, k);
	}
}
