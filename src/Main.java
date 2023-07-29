public class Main {
    public static void main(String[] args) {
        ListService listService = new ListService();
        listService.addNode(4);
        listService.addNode(3);
        listService.addNode(2);
        listService.addNode(1);
        Node head = listService.getHead();
        Node reverseList = listService.getReversedList(head);
        Node newHead = listService.getHead();
    }
}