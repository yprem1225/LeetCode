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
        // // to traverse and get the size
        // ListNode temp = head;
        // int size =  0;
        // while(temp!=null){
        //     size++;
        //     temp = temp.next;
        // }

        // ListNode middle = head;
        // int mid = size/2; // find middle


        // // to get the value at middle
        // for(int i = 1 ; i<=mid ; i++){
        //     middle = middle.next;
        // }

        // return middle;

        //Better Approach (fast and slow approach)

        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        return slow;


        
    }
}