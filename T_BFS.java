import java.util.LinkedList;
import java.util.Queue;

public class T_BFS {

	public void levelOrderQueue(Node root) {
		LinkedList<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			System.out.print(" " + n.data);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}


    public int Max(Node root)
    {
        int current;

        LinkedList<Node> q = new LinkedList<Node>();
        if(root == null)
            {
                return 0; 
            }

        q.add(root);
        current = root.data;

        while(!q.isEmpty())
        {
            System.out.println();
            Node n = (Node) q.remove();
            if(current< n.data)
            current = n.data;


            if(n.left != null)
            {
                q.add(n.left);
            }
            if(n.right != null)
            {
                q.add(n.right);
            }

        }

        return current;

    }


    public int min(Node root)
    {
        
    }








    public int heightBFS( Node root)
    {

        int height = 0 ;

        if (root == null)
            return 0;

        Queue<Node> queue = new LinkedList<Node>();


        queue.add(root);

        while(!queue.isEmpty())
        {

            Node n = queue.remove();

    

            if(n.left!= null)
                queue.add(n.left);
            if(n.right != null)
                queue.add(n.right);




        }


        return height;

    }


    public  int heightOfTree(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}

        Node delimiter = new Node(-5);


		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		// level delimiter
		queue.offer(delimiter);
		int height = 0;

		while (!queue.isEmpty()) {
			Node node = queue.poll();

            
            System.out.println(node.data);
			if (delimiter == node) {
				if (!queue.isEmpty()) {
					// level delimiter
					queue.offer(delimiter);
				}
                
				height++;
			} else {
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		return height;
	}





    public int Min(Node root )
    {
        if(root == null)
        {
            return 0;
        }


        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int current = root.data;
        while(!queue.isEmpty())
        {

            Node n = queue.remove();

            if(n.data < current)
                current = n.data;

            if(n.left != null)
                queue.add(n.left);
            if(n.right != null)
                queue.add(n.right); 

        }



        return current;
    }



    public boolean isCompleteTree(Node root)
    {

        if(root == null)
        {
            return true;
        }

        
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            Node temp = q.remove();

            if(temp == null)
            {
                while(!q.isEmpty())
                {
                    Node temp2 = q.remove();
                    if(temp2 != null)
                    {
                        return false;
                    }
                }

                return true;
            }


            q.add(temp.left);
            q.add(temp.right);



        }



        return true;


    }



    public static Node arryToBST(int[] nums , int left, int right)
    {
        if (left>right)
            return null;

        if ( left == right)
            return new Node(nums[left]);

        int mid = (left + right) / 2;


        Node root = new Node(nums[mid]);
        
        root.left = arryToBST(nums, left, mid-1);
        root.right = arryToBST(nums, mid+1, right);

        return root;

    }










	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		T_BFS i = new T_BFS();

        System.out.println("\n\n\n");
        System.out.println(i.heightBFS(root));





	}
}

class Node  {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

   
}