package listlinked.domain;

import generclinkedlist.domain.Node;

public class NodeList<TYPE> {
    private TYPE value;
    private NodeList<TYPE> next;

    public NodeList(TYPE newValue) {
        this.value = newValue;
    }

    public NodeList<TYPE> getNext() {
        return next;
    }

    public void setNext(NodeList<TYPE> next) {
        this.next = next;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }


}
