package leetcode;

class MergeTwoSortedLists {

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
        {
            ListNode p1 = l1;
            ListNode p2 = l2;
            ListNode ans = new ListNode(-1);
            ListNode p3 = ans;
            if(l1==null)
                return l2;
            if(l2==null)
                return l1;
            while(p1!=null&&p2!=null){
                if(p1.val< p2.val){
                    p3.next=p1;
                    p1 = p1.next;
                }else{
                    p3.next=p2;
                    p2 = p2.next;
                }
                p3=p3.next;
            }
            while (p1!=null){
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
            }

            while (p2!=null){
                p3.next = p2;
                p2 = p2.next;
                p3 = p3.next;
            }
            return ans.next;
        }
    }    
    
    public static void print(ListNode l){
        ListNode temp = l;
        while(temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
  }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = {5};
        ListNode l1 =new ListNode();
        ListNode l2 =new ListNode();
        ListNode temp = l1;
        ListNode temp2 = l2;
        for (int i : arr) {
            temp.next= new ListNode(i);
            temp=temp.next;
        }   
        for (int i : arr2) {
            temp2 .next= new ListNode(i);
            temp2=temp2.next;
        }
        Solution solution = new Solution();
        ListNode ans = solution.mergeTwoLists(l1.next,l2.next);
        System.out.print("ANS: ");
        MergeTwoSortedLists.print(ans);
    }
}