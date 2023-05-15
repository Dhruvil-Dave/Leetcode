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
         ListNode node = head;
        int len = 0;
		//Calculate the length of list
        while(node != null){
            len++;
            node = node.next;
        }
        int lk = len-k+1;
        int cnt = 0;
        ListNode first = null, second = null; node = head;
		//Store k-th node from beginning in first and k-th from end in second
        while(cnt < lk || cnt < k){
            cnt++;
            if(k == cnt){
                first = node;
            }
            if(lk == cnt){
                second = node;
            }
            node = node.next;
        }
		//Swap the values of both nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}