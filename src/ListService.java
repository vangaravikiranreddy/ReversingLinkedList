public class ListService {

    private Node head;
    public Node getHead() {
        return head;
    }
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tempNode = new Node(value);
            tempNode.next = head;
            head = tempNode;
        }
    }
    public Node getReversedList(Node head) {
        if (head == null) {
            return null;
        }
        Node prevNode = null;

        while (head != null) {
            Node nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        this.head = prevNode;
        return this.head;
    }
}
