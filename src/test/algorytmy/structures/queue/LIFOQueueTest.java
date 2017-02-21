package test.algorytmy.structures.queue;


import algorytm.structures.queue.Queue;
import algorytm.structures.queue.LIFOQueue;
import algorytm.structures.queue.QueueException;

public class LIFOQueueTest {
    public static void main(String[] args) {

        Queue queue = new LIFOQueue();
        try {
            queue.pop();
        } catch (QueueException e) {
            e.printStackTrace();
        }
        System.out.println();

        queue.push(3);
        queue.push(2);
        queue.push(1);
        queue.push(0);
        System.out.println(queue);

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);

//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println();

    }
}
