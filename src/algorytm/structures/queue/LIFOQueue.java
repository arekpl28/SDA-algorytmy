package algorytm.structures.queue;

public class LIFOQueue implements Queue {

    private int value;
    private LIFOQueue next;

    public LIFOQueue() {
    }

    public LIFOQueue(int value) {
        this.value = value;
    }

    @Override
    public void push(int value) {
        LIFOQueue lifoQueue = new LIFOQueue(value);
        LIFOQueue old = this.next;
        lifoQueue.next = old;
        this.next = lifoQueue;
    }

    @Override
    public int pop() {
        if (this.next == null) {
            System.out.println("Quenue is empty");
            return 0;
        }
        LIFOQueue first = this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    @Override
    public Queue clone() {
        LIFOQueue clonedQueue = new LIFOQueue();
        LIFOQueue returnQueue = clonedQueue;
        LIFOQueue tmpQueue = this.next;
        while (tmpQueue != null) {
            clonedQueue.next = new LIFOQueue(tmpQueue.value);
            tmpQueue = tmpQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return returnQueue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        LIFOQueue lifoQueue = this.next;
        stringBuilder.append("[");
        while (lifoQueue != null) {
            stringBuilder.append(lifoQueue.value);
            if (lifoQueue.next != null) {
                stringBuilder.append(", ");
            }
            lifoQueue = lifoQueue.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
