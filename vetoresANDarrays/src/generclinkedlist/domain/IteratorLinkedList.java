package generclinkedlist.domain;

public class IteratorLinkedList<TYPE> {
    private Node<TYPE> current;

    public IteratorLinkedList(Node<TYPE> current) {
        this.current = current;
    }

    public boolean nextExist(){
        if (current.getNext() == null){
            return false;
        } else {
            return true;
        }
    }

    public Node<TYPE> getNextIterator(){
        current = current.getNext();
        return current;
    }

}
