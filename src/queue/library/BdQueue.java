package src.queue.library;

import src.queue.vo.Cat;

public class BdQueue {
    private Cat[] list;
    // 여기서의 list는 queue역할을 해요
    private int queueSize = 0;
    private int front = -1;
    private int back = -1;

    public BdQueue(int sizeOfQueue) {
        queueSize = sizeOfQueue;
        list = new Cat[sizeOfQueue];
    }

    public void enqueue(Cat cat) {
        list[++back] = cat;
    }

    public Cat dequeue() {
        ++front;
        Cat cat = list[front];
        list[front] = null;
        return cat;
    }

    public int getSize() {
        return queueSize;
    }

    public void printAllQueue() {
        for (int i = 0; i < queueSize; i++){
            System.out.println(list[i]);
        }
    }

    // 출처: https://longbeom.tistory.com/80
    // 출처: https://www.softwaretestinghelp.com/java-queue-interface/
}
