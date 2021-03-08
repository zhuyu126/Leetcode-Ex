/**
 * 递归解法
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseList(null,head);
    }
    private ListNode reverseList(ListNode prev,ListNode node){
        if (node==null){
            return prev;
        }
        ListNode next=node.next;
        node.next=prev;
        return reverseList(node,next);
    }
}
