package src.stack.library;

public class BdStack {
    private int stackPointer; // stack의 위치를
    private int stackVolume; // stack의 용량
    private int[] bdStack;

    // 생성자
    public BdStack(int capacity) {
        stackPointer = 0; // pointer가 0부터 시작하니까, stack pointer의 시작부터 끝은 0......(n-1)이 됩니다
        stackVolume = capacity;
        try {
            bdStack = new int[stackVolume];
        } catch (OutOfMemoryError e) {
            System.out.println("bdStack: " + e.toString());
            stackVolume = 0;
        }
    }

    // Stack에 요소를 넣는 메소드, 반환할때에 stack에 삽입. 삽입할 당시에는 현재의 포인터, 삽입 후에는 후치연산으로 증가되게끔 구현
    public int push(int stackStuff) throws OverflowIntStackException {
        if(stackPointer >= stackVolume) {
            throw new OverflowIntStackException();
        }
        return bdStack[stackPointer++] = stackStuff;
    }


    // Stack에서 가장 마지막에 삽입된 값을 반환하는 메소드. stack이 비어서 pop을 할 수 없다면 예외 생황 발생
    public int pop() throws EmptyIntStackException {
        if(stackPointer <= 0) {
            throw new EmptyIntStackException();
        }
        return bdStack[--stackPointer];
    }

    // Stack에 직접적으로 변화를 주는것이 아니라, 가장 위에 있는 데이터를 들여다 보는 메소드
    public int peek() throws EmptyIntStackException {
        if(stackPointer <= 0) {
            throw new EmptyIntStackException();
        }
        return bdStack[stackPointer - 1];
    }

    // stack의 정상쪽에서부터 -> 바닥쪽까지 검색하는 메서드
    public int findIndexOf(int stackStuff) {
        for (int i = stackPointer -1; i >= 0; i --) { // 정상쪽에서 부터 선형 검색
            if (bdStack[i] == stackStuff) {
                return i; // 찾은 검색값 반환
            }
        }
        return -1; // 검색 실패
    }

    // Stack의 모든 요소를 삭제하는 메서드 clear..
    public void clear() {
        stackPointer = 0;
    }

    // Stack의 용량을 반환
    public int getStackVolume() {
        return stackVolume;
    }

    // Stack에 실제 쌓여있는 데이터의 갯수를 반환
    public int getStackPointer() {
        return stackPointer;
    }

    // Stack이 비어있는지 검사하는 메소드
    public boolean isEmpty() {
        return stackPointer <= 0;
    }


    // Stack이 가득 찼는지 검사하는 메소드
    public boolean isFull() {
        return stackPointer >= stackVolume;
    }

    // Stack안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (stackPointer <= 0) {
            System.out.println("스택이 비어있습니다");
        } else {
            for (int i = 0; i < stackPointer; i++) {
                System.out.println(bdStack[i]+" ");
                System.out.println("");
            }
        }
    }

    // Stack이 비어있을 때
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }


    // Stack이 가득 찼을 때
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }
}
