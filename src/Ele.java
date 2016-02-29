public class Ele {
    private Ele next;
    private Ele prev;
    private int value;

    public Ele(int number) {
        this.value = number;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

    public void updateNext(Ele e) {
        this.next = e;
    }

    public void updatePrev(Ele e){
        this.prev = e;
    }

    public Ele getPrevElement(){
        return prev;
    }

    public Ele getNextElement(){
        return next;
    }
}
