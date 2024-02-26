package arrays.domain;

import javax.lang.model.element.Element;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        this.size = 0;
    }
    public Node getFirst() {
        return first;
    }

       public Node getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNewElement(String newValue){
        Node newElement = new Node(newValue);
        if (first == null && last == null){
            first = newElement;
            last = newElement;

        } else {
            last.setNode(newElement);
            last = newElement;
        }
        size++; //novo
    }

    public Node getElement(int position){
        Node element = null;
        if (position <= size){
            for (int i = 1; i < position; i++){
                if (first.getNext() != null){
                    element= first.getNext();
                    return element;
                }
            }
        } else {
            System.out.println("A lista tem um tamanho menor, tamannho de: "+size+" elementos");

        }
        return element;
    }

    public void  deleteElement(String value){
        Node local = first;
        Node prevLocal = null;
        for(int i = 0; i < this.size; i++) {
            if(local.getValue().equalsIgnoreCase(value)){
                if(local.equals(first) && local.equals(last)){
                    first = null;
                    last = null;
                } else if (local.equals(first)){
                    first = local.getNext();
                    local.setNode(null);
                } else if (local.equals(last)){
                    last = prevLocal;
                    prevLocal.setNode(null);
                } else {
                    prevLocal = local;
                    local = local.getNext();
                }
                size--;

            }


        }
    }
}
