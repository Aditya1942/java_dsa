/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            if(n==1){
                head=null;
                 return head;
            }else{
                return head;
            }
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        int count = 0;
        while(pointer1 != null ){
            // System.out.print(pointer1.val);
            // System.out.print(pointer2.val);
            // System.out.println();
            pointer1 = pointer1.next;
            if(count>n){
            pointer2 = pointer2.next;
            }
            else{
                count++;
            }
        }
        // System.out.print(pointer2.val);
        if(count  == n){
            // if n is first node 
            head = pointer2.next;
            return head;
        }
        pointer2.next = pointer2.next.next;
        return head;
        
    }
}


// link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/