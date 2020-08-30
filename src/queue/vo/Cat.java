package src.queue.vo;

import javax.print.DocFlavor;

public class Cat implements Comparable<Cat> {
    private int index;
    private String name;

    public Cat(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Cat o) {
        return getIndex() - o.index;
    }
}
