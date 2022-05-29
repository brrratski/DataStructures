


import java.util.Collections;
import java.util.LinkedList;

public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        System.out.println("Linked list before: " + linkedList);
        Collections.reverse(linkedList);
        System.out.println("Linked list after reverse" + linkedList);




    }
}
