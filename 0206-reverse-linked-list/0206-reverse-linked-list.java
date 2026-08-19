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
    public ListNode reverseList(ListNode head) {
    // Using arraylist
    //      if (head == null || head.next == null) {
    //         return head;
    //     }

    //     ListNode temp = head;
    //     ArrayList<ListNode> arr = new ArrayList<>();

    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }

    //     int n = arr.size();

    //     for(int i = n-1 ; i>=1 ; i--){
    //         ListNode t1 = arr.get(i);
    //         ListNode t2 = arr.get(i-1);

    //         t1.next = t2;
    //     }

    //    head.next = null;

    //     return arr.get(n-1);
        

    //Usig curr prev frwd

    ListNode curr = head;
    ListNode prev = null;
    ListNode frwd = null;


    while(curr!=null){
        frwd = curr.next;
        curr.next = prev;

        prev = curr;
        curr = frwd;
    }

    return prev;
    }


    
}