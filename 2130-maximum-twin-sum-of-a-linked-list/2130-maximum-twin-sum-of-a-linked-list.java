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
    public int pairSum(ListNode head) {
        // divide ll in two halve (only even size ll is present)
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next =  null;

        // reverse the second half

        head2 = reverse(head2);

        //calculate twin sum

        ListNode i = head;
        ListNode j = head2;
        int twinSum = 0;

        while(i!=null){
            int sum = i.val + j.val;

            if(sum>twinSum){
                twinSum = sum;
            }

            i = i.next;
            j = j.next;
        }

        return twinSum;
        
    }
}