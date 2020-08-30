package src.array.library;

public class Array {
    // 1차원 배열 리스트로 구현 & 1차원 배열 순회하기
    private int[] numberList = {1, 2, 3};

    public void getOneDemesionArray() {
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
    }

    // 2차원 배열 리스트로 구현 & 2차원 배열 순회하기
    private int[][] numberList2 = {{2, 4}, {1, 2, 3}};

    public void getTwoDemensionArray() {
        for (int i = 0; i < numberList2.length; i++) {
            for (int j = 0; j < numberList2[i].length; j++) {
                System.out.print(numberList2[i][j] + " ");
            }
        }
    }
}
