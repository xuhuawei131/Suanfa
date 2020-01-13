public class RemoveLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,null);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while (fast.next != null) {
            if (count < n) {
                count++;
                fast = fast.next;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow.next;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1,null);
        ListNode node2=new ListNode(2,node1);
        ListNode node3=new ListNode(3,node2);
        ListNode node4=new ListNode(4,node3);
        ListNode node5=new ListNode(5,node4);

        RemoveLinkedList removeLinkedList=new RemoveLinkedList();
        System.out.println(removeLinkedList.removeNthFromEnd(node5,2).content);
    }

}
