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
    public boolean isPalindrome(ListNode head) {
        //Using ArrayList

        // ListNode temp = head;
        // ArrayList<Integer> arr = new ArrayList<>();

        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }

        // int i = 0 , j = arr.size()-1;
        // while(i<j){
        //     if(arr.get(i)!=arr.get(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }

        // return true;

        //1.Divide the linkedlist from middle 2.reverse the second hald 3.compare
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;


        //reverse second half
        head2 = reverse(head2);

        // apply 2 pointer and compare both the list
        ListNode i = head;
        ListNode j = head2;

        while(j!=null){
            if(i.val!=j.val){
                return false;
            }
            i = i.next;
            j = j.next;
        }
       
        return true;
    }
}