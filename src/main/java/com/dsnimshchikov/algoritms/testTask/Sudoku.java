package com.dsnimshchikov.algoritms.testTask;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 1) Строки не должны содержать цифры от 1 до 9 без повторений
 * 2) Столбцы не должны содержать цифры от 1 до 9 без повторений
 * 3) Каждый из боксов 3 x 3, внутри вложенных боксов должны содержаться цифры от 1 до 9 без повторений
 */
public class Sudoku {

    //    метод должен провалидировать переданную доску на соответствие правилам 1,2
//    по возможности 3 в комментариях к классу
    private static boolean isValidSudoku(char[][] board) {
        // писать код тут
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!isValidStr(board[i], j) ||
                        !isValidColumn(board, j, i) ||
                        !isValidQuad(board, i / 3 * 3, j / 3 * 3, board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    //проверка строки
    private static boolean isValidStr(char[] boardStr, int indexChar) {
        for (int i = indexChar + 1; i < 9; i++) {
            if (boardStr[i] == boardStr[indexChar]) {
                return false;
            }
        }
        return true;
    }

    //проверка столбца
    private static boolean isValidColumn(char[][] board, int indexColumn, int indexStrChar) {
        for (int i = indexStrChar + 1; i < 9; i++) {
            if (board[i][indexColumn] == board[indexStrChar][indexColumn]) {
                return false;
            }
        }
        return true;
    }

    //проверка квадрата
    private static boolean isValidQuad(char[][] board, int indexStr, int indexColumn, char testValid) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[indexStr + i][indexColumn + j] == testValid) {
                    if (flag) {
                        return false;
                    }
                    flag = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'2', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean res = isValidSudoku(board);

        System.out.println(res);
    }
}


