import src.array.library.Array;
import src.queue.library.BdQueue;

import src.queue.vo.Cat;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class main {
    public static void main(String[] args) {
        // 01.array
        Array numberOneExample = new Array();
        numberOneExample.getOneDemesionArray();
        System.out.println("");
        System.out.println("");
        numberOneExample.getTwoDemensionArray();
        System.out.println("");
        System.out.println("");

        // 02.queue
        // 02-(1). 언어적 차원에서 지원하는 큐(Queue)로 구현
        Queue<Cat> cat_queue = new ArrayDeque<>();
        cat_queue.add(new Cat(1,"somi"));
        cat_queue.add(new Cat(2,"semi"));
        cat_queue.add(new Cat(3,"sumi"));
        System.out.println(cat_queue);
        cat_queue.poll();
        System.out.println(cat_queue);
        System.out.println("");
        System.out.println("");

        // 02-(2). 언어적 차원에서 지원하는 우선순위 큐(priority BdQueue) 구현
        Queue<Cat> cat_pqueue = new PriorityQueue<>();
        cat_pqueue.add(new Cat(1,"somi"));
        cat_pqueue.add(new Cat(2,"semi"));
        cat_pqueue.add(new Cat(3,"sumi"));
        System.out.println(cat_pqueue);
        cat_pqueue.poll();
        System.out.println(cat_pqueue);
        System.out.println("");
        System.out.println("");

        // 02-(3). 리스트를 변수로 사용하여 큐 구현
        Cat somi = new Cat(1,"somi");
        Cat semi = new Cat(2,"semi");
        Cat sumi = new Cat(3,"sumi");

        BdQueue cat_bdqueue = new BdQueue(3);
        cat_bdqueue.enqueue(somi);
        cat_bdqueue.enqueue(semi);
        cat_bdqueue.enqueue(sumi);
        cat_bdqueue.printAllQueue();
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < cat_bdqueue.getSize(); i++) {
            System.out.println(cat_bdqueue.dequeue());
        }
        System.out.println("");
        System.out.println("");

        // 02-(4). 리스트를 변수로 하여 우선순위 큐(Priority Queue) 구현

    }
}
