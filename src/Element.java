public class Element<T> {
    private Element next;
    private Element prev;
    private T value;

    public Element(T number) {
        this.value = number;
        this.next = null;
        this.prev = null;
    }

    public T getValue(){
        return this.value;
    }

    public void updateNext(Element e) {
        this.next = e;
    }

    public void updatePrev(Element e){
        this.prev = e;
    }

    public Element getPrevElement(){
        return prev;
    }

    public Element getNextElement(){
        return next;
    }
}
