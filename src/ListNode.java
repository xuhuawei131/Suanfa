public class ListNode {
    public int content;
    public ListNode next;
    public ListNode(int content,ListNode next){
        this.content=content;
        this.next=next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "content=" + content +
                '}';
    }
}
