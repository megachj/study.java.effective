package chap05_제네릭.rule26_제네릭자료형;

import chap05_제네릭.rule26_제네릭자료형.classes.Stack_26;

public class Main26 {
    public static void main(String[] args) {
        Stack_26<String> stack = new Stack_26<>();
        String[] names = new String[]{"dan", "shaun", "choe"};
        for (String name: names)
            stack.push(name);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());

        System.out.println("---------------");

        Stack_26<int[]> matrixStack = new Stack_26<>();
        int[][] matrix2_2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row: matrix2_2)
            matrixStack.push(row);
        while (!matrixStack.isEmpty()) {
            int[] row = matrixStack.pop();
            System.out.println(String.format("%d %d %d", row[0], row[1], row[2]));
        }
    }
}
