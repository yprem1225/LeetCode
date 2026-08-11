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
    public ListNode swapNodes(ListNode head, int k) {
        //Find the length
        ListNode temp = head;
        int size = 0;

        while(temp!=null){
            size++;
            temp = temp.next;
        }

        // Store the values of both the node
        ListNode start = head;
        ListNode end = head;

        int valStart = 0;
        int valEnd = 0;

        // from start
        for(int i = 1 ; i<k ; i++){
            start = start.next;
        }
        valStart = start.val;

        //From end
        for(int i = 1 ; i<=size-k ; i++){
            end = end.next;
        }
        valEnd = end.val;


        start.val = valEnd;
        end.val = valStart;

        return head;

    
    }
}