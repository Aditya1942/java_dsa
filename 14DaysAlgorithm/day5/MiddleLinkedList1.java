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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        int count2 = 0;
        while(temp!= null){
            temp=temp.next;
            count ++;
        }
        temp = head;
         while(temp!= null){
             if(count/2==count2){
               // System.out.println(count/2);   
               // System.out.println(temp.val);   
                 head=temp;
                 break;
             }
             count2++;
            temp=temp.next;   
        }
        return head;
    }
}

// link : https://leetcode.com/problems/middle-of-the-linked-list/