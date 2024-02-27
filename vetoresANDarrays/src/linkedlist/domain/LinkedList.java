package linkedlist.domain;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void setNewElement(String newValue) {
        Node element = new Node(newValue);
        if (first == null && last == null) {
            first = element;
            last = element;
            first.setNext(element);
        } else {
            last.setNext(element);
            last = element;
        }
        size++;
    }

    public void getAllElements() {
        Node local = first;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                System.out.println(local.getValue());
            } else {
                local = local.getNext();
                System.out.println(local.getValue());
            }
        }
    }

    public void getElement(String value) {
        Node local = first;
        for (int i = 0; i < size; i++) {
            if (local.getValue().equalsIgnoreCase(value)) {
                System.out.println("Name: " + value + " is in our database.");
                break;
            } else if (i == (size - 1) && local.getValue() != value) {
                System.out.println("Name not found");

            } else if (local.getValue() != value) {
                local = local.getNext();

            }
        }
    }

    public void modifyElement(String value, String newValue) {
        Node local = first;
        for (int i = 0; i < size; i++) {
            if (local.getValue().equalsIgnoreCase(value)) {
                local.setValue(newValue);
                break;
            } else if (i == (size - 1) && local.getValue() != value) {
                System.out.println("Name not found");

            } else if (local.getValue() != value) {
                local = local.getNext();

            }
        }
    }

    public void deleteElement(String value) {
        Node local = first;
        Node previous;
        for (int i=0; i < size; i++){
            if (local.getValue().equalsIgnoreCase(value) && local.equals(first)){
                first = first.getNext();
                size--;
            } else if (!local.getValue().equalsIgnoreCase(value)){
                previous = local;
                local = local.getNext();
                if (local.getValue().equalsIgnoreCase(value) && local.equals(last)){
                    last = previous;
                    last.setNext(null);
                    size--;
                } else if (local.getValue().equalsIgnoreCase(value)){
                    previous.setNext(local.getNext());
                    local.setValue(null);
                    size--;
                    break;
                }

            }

        }
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
