package algorytm.structures.queue;


public interface Queue {
    void push(int value);

    int pop() throws QueueException;

    Queue clone();

}
