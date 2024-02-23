package arrays.domain;

public class Node {
    private Node next;
    private String value;

    public Node(String newValue){
        this.value = newValue;
    }

    public void setNode(Node newElement){
        this.next = newElement;
    }

    public Node getNext(){
        return next;
    }

    public void setValue(String newValue){
        this.value = newValue;
    }

    public String getValue(){
        return value;
    }
}

