class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int curr = m+n-1; 
        m--;
        n--;
        
        while(m != -1 || n != -1)
        {    
           
            if(m == -1)
            {
                nums1[curr--] = nums2[n--];
            }
            
            else if(n == -1)
            {
                nums1[curr--] = nums1[m--];
            }
        
            else if (nums1[m]>nums2[n])
            {
                nums1[curr--] = nums1[m--];
            }
            
            else 
            {
                nums1[curr--] = nums2[n--];
            }
        
        }
        
        
    }
}