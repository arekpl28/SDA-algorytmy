package test.algorytmy.structures.queue;


import algorytm.structures.queue.FIFOQueue;
import algorytm.structures.queue.LIFOQueue;
import algorytm.structures.queue.Queue;
import algorytm.structures.queue.QueueException;

import javax.sound.midi.Soundbank;

public class FIFOQueueTest {
    public static void main(String[] args) throws QueueException {
        Queue queue = new FIFOQueue();
        queue.pop();
        queue.push(2);
        System.out.println(queue);
        queue.push(3);
        System.out.println(queue);
        queue.push(4);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.push(6);
        System.out.println(queue);
        queue.push(7);
        System.out.println(queue);
        queue.push(8);
        System.out.println(queue);
        System.out.println();


        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);
        clonedQueue.pop();
        System.out.println(queue);
        System.out.println();

        System.out.println(clonedQueue);
        System.out.println(queue);

    }
}
