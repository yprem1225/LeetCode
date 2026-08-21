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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode oddHead = head;

        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = null; 

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = oddHead;
        ListNode j = evenHead;

        while(i!=null && j!=null){
            temp.next = j;
            temp = temp.next;
            j = j.next;

            temp.next = i;
            temp = temp.next;
            i = i.next;
        }

        if(i!=null){
            temp.next=i; // leftover node when list length is odd
        }

        return dummy.next;
        
    }
}