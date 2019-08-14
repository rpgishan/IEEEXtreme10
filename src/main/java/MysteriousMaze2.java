/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Gishan
 */
final class Coordinate {

    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class MysteriousMaze2 {

    private final int[][] maze;

    public MysteriousMaze2(int[][] maze) {
        if (maze == null) {
            throw new NullPointerException("The input maze cannot be null");
        }
        if (maze.length == 0) {
            throw new IllegalArgumentException("The size of maze should be greater than 0");
        }

        this.maze = maze;
    }

    public List<Coordinate> solve() {
        return getMazePath(0, 0, new Stack<Coordinate>());
    }

    private List<Coordinate> getMazePath(int row, int col, Stack<Coordinate> stack) {
        assert stack != null;

        stack.add(new Coordinate(row, col));

        if ((row == maze.length - 1) && (col == maze[0].length - 1)) {
            Coordinate[] coordinateArray = stack.toArray(new Coordinate[stack.size()]);
            return Arrays.asList(coordinateArray);
        }

        for (int j = col; j < maze[row].length; j++) {

            if ((j + 1) < maze[row].length && maze[row][j + 1] == 1) {
                return getMazePath(row, j + 1, stack);
            }

            if ((row + 1) < maze.length && maze[row + 1][col] == 1) {
                return getMazePath(row + 1, col, stack);
            }
        }

        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), x, y;
        int[][] mazear = new int[n][n];
        for (int i = 0; i < n*n; i++) {
            x = s.nextInt();
            if (x == -1) {
                break;
            }
            y = s.nextInt();
            mazear[x - 1][y - 1] = 1;
        }
        
        for (int i = 0; i < mazear.length; i++) {
            for (int j = 0; j < mazear.length; j++) {
                System.out.print(mazear[i][j]+" ");
            }
            System.out.println("");
        }

        MysteriousMaze2 maze = new MysteriousMaze2(mazear);

        for (Coordinate coord : maze.solve()) {
            System.out.println(coord.getX() + " : " + coord.getY());
        }
    }
}
