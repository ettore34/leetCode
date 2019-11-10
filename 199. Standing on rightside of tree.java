



//BFS level traversal 
//      1
//    2   3
//    4     5

public List<Interger> rightSideView(node root)
{
    List<Interer> answer = new ArrayList<>();
    if(root==null) return asnwer;

    Queue<node> q = new LinkedList<>();
    q.add(root);

    while(q.size() >  0)
    {
        int size = q.size();

        for(int i =0 ; i<size; i++)
        {
            node temp = q.poll();

            if(temp.left() != null) q.add(temp.left);
            if(temp.right() != null) q.add(temp.right);

            if(i == q.size() -1 )answer.add(temp.value);
        }
    }

    return answer;

}  