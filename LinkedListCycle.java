import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}

 class ListNode {
    int val;
    ListNode next;
     ListNode(int x) {
        val = x;
         next = null;
     }
 }