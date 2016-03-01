public class LinkedList {
    private int length;
    private Ele tail;
    private Ele head;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void add(int number) {
        Ele e = new Ele(number);
        if (length == 0) {
            head = tail = e;
        } else {
            Ele holder = tail;
            tail.updateNext(e);
            tail = e;
            tail.updatePrev(holder);
        }
        this.length++;
    }

    public int getLength() {
        return length;
    }

    public Ele getHead() {
        return head;
    }

    public Ele getTail() {
        return tail;
    }

    public int searchElementAt(int index) {
        Ele e = this.getHead();
        int c = 0;
        for (int i = 0; i < this.getLength(); i++) {
            if (c == index) {
                return e.getValue();
            }
            c++;
            e = e.getNextElement();
        }
        return 0;
    }

    public void remove(int value) {
        Ele e = this.getHead();
        for (int i = 0; i < this.getLength(); i++) {
            if (value == e.getValue()) {
                if (i == 0) {
                    Ele next = e.getNextElement();
                    next.updatePrev(null);
                    this.head = next;
                } else if (i == length - 1) {
                    Ele prev = e.getPrevElement();
                    prev.updateNext(null);
                    this.tail = prev;
                } else {
                    Ele prev = e.getPrevElement();
                    Ele next = e.getNextElement();
                    prev.updateNext(next);
                    next.updatePrev(prev);
                }
                this.length--;
            }
            e = e.getNextElement();
        }
    }
}
