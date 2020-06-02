/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next == null) return;
        ListNode current = node;
        ListNode nextNode = current.next;
        current.val = nextNode.val;   
        current.next = nextNode.next;
    }
}
