package listlinked.domain;

import generclinkedlist.domain.Node;
import listlinked.domain.NodeList;

public class ListLinked<TYPE> {
    private NodeList<TYPE> first;
    private NodeList<TYPE> last;
    private int size;

    public ListLinked() {
        this.size = 0;
    }

    public void setElement(TYPE newValue) {
        if (this.first == null && this.last == null) {
            first = new NodeList<>(newValue);
            last = new NodeList<>(newValue);
            first.setNext(last);
        } else {
            NodeList<TYPE> newElement = new NodeList<>(newValue);
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    public TYPE getElement(TYPE element) {
        TYPE value = null;
        NodeList<TYPE> current = first;
        if (first.getValue().equals(element)) {
            return first.getValue();
        }
        while (!current.getValue().equals(element)) {
            current = current.getNext();
            if (current.getValue().equals(element)) {
                return current.getValue();
            } else if (current.getNext() == null) {
                System.out.println("Value not found!");
                break;
            }
        }
        return value;
    }

    public void getall(){
        NodeList<TYPE> current = first;
        while (current.getNext() != null){
            System.out.println(current.getValue());
            current = current.getNext();
            if (current.getNext() == null){
                System.out.println(current.getValue());
            }
        }
    }
    public void delElement(TYPE element){
        NodeList<TYPE> previus;
        NodeList<TYPE> current = first;
        if (first.getValue().equals(element)){
            first.setValue(null);
            first.setNext(null);
            size--;
        } while (!current.getValue().equals(element)){
            previus = current;
            current = current.getNext();
            if (current.getValue().equals(element)){
                previus.setNext(current.getNext());
                current.setValue(null);
                size--;
                break;
            } else if (current.getValue().equals(last) && last.getValue().equals(element)){
                previus.setNext(null);
                last.setValue(null);
                size--;
                break;
            }
        }
    }

    public IteratorList<TYPE> useIterator() {
        return new IteratorList<>(this.first);
    }

    public NodeList<TYPE> getFirst() {
        return first;
    }

    public NodeList<TYPE> getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }
// Modificação para ver no github

}
