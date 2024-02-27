package generclinkedlist.domain;

public class LinkedList<TYPE> {
    private Node<TYPE> first;
    private Node<TYPE> last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void setNewElement(TYPE newValue) {
        Node<TYPE> element = new Node<TYPE>(newValue);
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


    public TYPE getElement(TYPE value) {
        Node<TYPE> local = first;
        for (int i = 0; i < size; i++) {
            if (local.getValue().equals(value)) {
                return value;
            } else if (i == (size - 1) && local.getValue() != value) {
                System.out.println("Name not found");

            } else if (local.getValue() != value) {
                local = local.getNext();

            }
        }
        return value;
    }

    public void modifyElement(TYPE value, TYPE newValue) {
        Node<TYPE> local = first;
        for (int i = 0; i < size; i++) {
            if (local.getValue().equals(value)) {
                local.setValue(newValue);
                break;
            } else if (i == (size - 1) && local.getValue() != value) {
                System.out.println("Name not found");

            } else if (local.getValue() != value) {
                local = local.getNext();

            }
        }
    }

    public void deleteElement(TYPE value) {
        Node<TYPE> local = first;
        Node<TYPE> previous;
        for (int i=0; i < size; i++){
            if (local.getValue().equals(value) && local.equals(first)){
                first = first.getNext();
                size--;
            } else if (!local.getValue().equals(value)){
                previous = local;
                local = local.getNext();
                if (local.getValue().equals(value) && local.equals(last)){
                    last = previous;
                    last.setNext(null);
                    size--;
                } else if (local.getValue().equals(value)){
                    previous.setNext(local.getNext());
                    local.setValue(null);
                    size--;
                    break;
                }

            }

        }
    }

    public IteratorLinkedList<TYPE> getIterator(){
        return new IteratorLinkedList<>(this.getFirst());
    }

    public Node<TYPE> getFirst() {
        return first;
    }

    public void setFirst(Node<TYPE> first) {
        this.first = first;
    }

    public Node<TYPE> getLast() {
        return last;
    }

    public void setLast(Node<TYPE> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
