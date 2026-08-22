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
     public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode frwd = null;
        ListNode curr =  head;
         

        while(curr!=null){
            frwd = curr.next;
            curr.next = prev;

            prev = curr;
            curr = frwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        //divide the ll
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        // reverse the second half
        head2 = reverse(head2);

        //now join alternate nodes
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;
        ListNode j = head2;

        while(i!=null && j!=null){
            temp.next = i;
            temp = temp.next;
            i = i.next;

            temp.next = j;
            temp = temp.next;
            j = j.next;
        }

        if(i!=null){
            temp.next=i; // leftover node when list length is odd
        }

        
        
    }
}