package algorytm.structures.queue;


public class FIFOQueue extends AbstractQueue {



    public FIFOQueue() {
    }

    private FIFOQueue(int value) {
        super(value);
    }

    @Override
    protected AbstractQueue getInstance() {
        return new FIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new FIFOQueue(value);
    }

    @Override
    public void push(int value) {
        AbstractQueue last = getLast();
        last.next = new FIFOQueue(value);
    }


}
