class Solution {
    public int numIslands(char[][] grid) {
        
        int CLen = grid.length;
        
        if(CLen == 0)
            return 0;
        
        int RLen = grid[0].length;
        
        int counter = 0 ;
        
        
        
        for(int i = 0 ; i < CLen; i++ )
        {
            for(int j = 0 ; j < RLen; j++)
            {
                if(isValid(grid,i,j))
                {
                    BFS(grid,i,j);
                    counter++;
                }
            }
        }
        
        return counter;
        
        
    }
    
    
    public void BFS(char[][] grid, int i, int j)
    {
        
        Queue<int[]> q = new LinkedList<>();
        int[] temp = new int[]{i,j}; 
        q.add(temp);
        
        while(!q.isEmpty())
        {
            
            temp = q.remove();
            if(isValid(grid, temp[0]+1,temp[1]))
                q.add(new int[]{ temp[0]+1,temp[1] });
            
            if(isValid(grid, temp[0],temp[1]+1))
                q.add(new int[]{ temp[0],temp[1]+1});
            
            if(isValid(grid, temp[0]-1,temp[1]))
                q.add(new int[]{ temp[0]-1,temp[1] });
            
            if(isValid(grid, temp[0],temp[1]-1))
                q.add(new int[]{ temp[0],temp[1]-1});
            
        }
            
        
    }
    
    public boolean isValid(char[][] grid,int i,int j)
    {
        int RLen = grid[0].length;
        int CLen = grid.length;
        
        if(i>=CLen || i < 0 || j < 0 || j>=RLen || grid[i][j] != '1')
        {
            return false;
        }
        
        grid[i][j] = '0';
        return true;
     
     
     }
    
    
}