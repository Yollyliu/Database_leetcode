import java.util.PriorityQueue;
import java.util.Stack;

public class Minstack {

        int min = Integer.MAX_VALUE;
        Node head;

        class Node {
            int data;
            Node next;

            public Node(int data) {
                next = null;
                this.data = data;
            }
        }

        public Minstack() {

        }

        public void push(int x) {
            if (x < min) {
                min = x;
            }
            Node node = new Node(min);
            node.next = new Node(x);

            if (this.head == null || head.next == null) {
                head = node;
            } else {
                Node temp = head;
                head = node;
                head.next.next = temp;
            }
        }

        public void pop() {
            if (this.head == null) {
                // Do nothing
            } else {
                Node currHead = head.next;
                if (currHead.next != null) {
                    head = currHead.next;
                    min = head.data;
                } else {
                    head = null;
                    this.min = Integer.MAX_VALUE;
                }
            }
        }

        public int top() {
            return head != null ? head.next.data : null;

        }

        public int getMin() {
            return min;

        }

}
class MinStack {

    /** initialize your data structure here. */
    PriorityQueue<Integer> queue;
    Stack<Integer> stack;
    public MinStack() {
        queue = new PriorityQueue<Integer>();
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }

    public void pop() {
        int x = stack.pop();
        if (x == queue.peek()) queue.poll();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}
