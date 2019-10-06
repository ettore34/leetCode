/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode answer = new ListNode(0);
        ListNode head = answer;
        
        //will add the lowest in the list. 
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {                
                answer.next = l1;
                l1 = l1.next;   
            }
            else 
            {
                answer.next = l2; 
                l2 = l2.next;
            }
            
            answer = answer.next;
            
        }
        
        //if list 1 not null 
        if(l1 != null)
        {
            answer.next = l1;
            l1 = l1.next;//need to check
            answer = answer.next;
        }
        
        //if list 2 not null 
        if(l2 != null)
        {
            answer.next = l2;
            l2 = l2.next;//need to check
            answer = answer.next;
        }
        
        
        
        return head; 
        
    }
}