package listlinked.domain;
import listlinked.domain.NodeList.*;
public class IteratorList<TYPE> {
    private NodeList<TYPE> current;

    public IteratorList(NodeList<TYPE> current) {
        this.current = current;
    }

    public boolean nextExist(){
        if (this.current.getNext() == null){
            return false;
        } else {
            return true;
        }
    }

    public NodeList<TYPE> getNext(){
        current = current.getNext();
        return current;
    }
}
