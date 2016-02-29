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
}
