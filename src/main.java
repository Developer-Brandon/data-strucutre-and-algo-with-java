import com.sun.org.apache.xml.internal.utils.IntStack;
import src.array.library.Array;
import src.queue.library.BdQueue;

import src.queue.vo.Cat;
import src.stack.library.BdStack;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class main {
    public static void main(String[] args) {
        // 01. array
        System.out.println("");
        System.out.println("######## 01.array ########");
        System.out.println("");
        Array numberOneExample = new Array();
        numberOneExample.getOneDemesionArray();
        System.out.println("");
        System.out.println("");
        numberOneExample.getTwoDemensionArray();
        System.out.println("");
        System.out.println("");

        // 02. queue
        // 02-(1). 언어적 차원에서 지원하는 큐(Queue)로 구현
        System.out.println("######## 02.queue ########");
        System.out.println("");
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
        // 추후 구현하여 업데이트 하겠습니다

        // 03. stack
        Scanner scannerIn = new Scanner(System.in);
        BdStack bdStack = new BdStack(64);

        while(true) {
            System.out.println("현재 데이터 수 : " + bdStack.getStackSize() + "/" + bdStack.getStackVolume());
            System.out.println("(1)푸시 (2)펍 (3)피크 (4)덤프 (0)종료");

            int menu = scannerIn.nextInt();
            if(menu == 0) break;

            int inputedValueByUser;
            switch (menu) {
                case 1:
                    System.out.println("데이터: ");
                    inputedValueByUser = scannerIn.nextInt();
                    try {
                        bdStack.push(inputedValueByUser);
                    } catch (BdStack.OverflowIntStackException e) {
                        System.out.println("Stack이 가득 찼습니다" + e);
                    }
                    break;
                case 2:
                    try {
                        inputedValueByUser = bdStack.pop();
                        System.out.println("Pop한 데이터는 "+inputedValueByUser+" 입니다");
                    } catch (BdStack.EmptyIntStackException e) {
                        System.out.println("Stack이 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        inputedValueByUser = bdStack.peek();
                        System.out.println("Peek한 데이터는 "+inputedValueByUser+" 입니다");
                    } catch (BdStack.EmptyIntStackException e){
                        System.out.println("Stack이 비어있습니다");
                    }
                    break;
                case 4:
                    bdStack.dump();
                    break;
            }

        }


        // 04. linked list
    }
}
