package generclinkedlist.domain;

public class Node<TYPE> {
    private Node<TYPE> next;
    private TYPE value;

    public Node(TYPE newValue) {
        this.value = newValue;
    }

    public Node<TYPE> getNext() {
        return next;
    }

    public void setNext(Node<TYPE> next) {
        this.next = next;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }
}

