import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterator {
    private int length;
    private Element tail;
    private Element head;
    private int iteratorLength;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
        this.iteratorLength = 0;
    }

    public void add(T value) {
        Element e = new Element(value);
        if (length == 0) {
            head = tail = e;
        } else {
            Element holder = tail;
            tail.updateNext(e);
            tail = e;
            tail.updatePrev(holder);
        }
        this.length++;
    }

    public int getLength() {
        return length;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public Element searchElementAt(int index) {
        if (index < this.length) {
            Element e = this.getHead();
            int c = 0;
            for (int i = 0; i < this.getLength(); i++) {
                if (c == index) {
                    return e;
                }
                c++;
                e = e.getNextElement();
            }
        }
        throw new NoSuchElementException("Not Found");
    }


    @Override
    public boolean hasNext() {
        this.iteratorLength++;
        return this.iteratorLength < this.length;
    }


    @Override
    public Element next() {
        return this.searchElementAt(iteratorLength);
    }

    @Override
    public void remove() {
        Element e = this.next();
        if (iteratorLength == 0) {
            Element next = e.getNextElement();
            next.updatePrev(null);
            this.head = next;
        }  else if (iteratorLength == length - 1) {
            Element prev = e.getPrevElement();
            prev.updateNext(null);
            this.tail = prev;
        } else {
            Element prev = e.getPrevElement();
            Element next = e.getNextElement();
            prev.updateNext(next);
            next.updatePrev(prev);
        }
        this.length--;
    }

    public Iterator Iterator() {
        return this;
    }
}
