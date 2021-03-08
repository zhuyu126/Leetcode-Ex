public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(0);
        ListNode cur=pre;
        int carry=0;
        while(l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;
            int sum=x+y+carry;
            carry=sum>9?1:0;
            sum=sum%10;
            cur.next=new ListNode(sum);
            cur=cur.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        //链表遍历完carry值为1则，在输出链表尾添加一个节点，节点值为carry
        if (carry==1){
            cur.next=new ListNode(carry);
        }
        return pre.next;
    }
}