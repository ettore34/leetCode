class Solution {
    public int[] diStringMatch(String S) {
    int l = S.length();    
    int[] answer = new int[ l+1 ];     
    int max = S.length();
    int min = 0; 

        
    for(int i = 0 ; i < S.length() ; i++)
    { 
        if( S.charAt(i) == 'I' ) answer[i] = min++; 
        else answer[i] = max--;
        
    }
        
        answer[l] = min;
        
        return answer;
    }
}