package common;

public class LinkedNode {
    public Object element;
    public LinkedNode next;

    public LinkedNode() {};

    public LinkedNode(Object element) {
        this.element = element;
    }

    public LinkedNode(Object element, LinkedNode next) {
        this.element = element;
        this.next = next;
    }
}
