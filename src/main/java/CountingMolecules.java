/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class CountingMolecules {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] ar = new int[3][4];
        ar[0][0] = s.nextInt();
        ar[1][0] = s.nextInt();
        ar[2][0] = s.nextInt();
        int h2o = 0, co2 = 0, glucose = 0;

        if (ar[0][0] >= 6 && ar[1][0] >= 12 && ar[2][0] >= 6) {
            ar[0][1] = ar[0][0] / 6;
            ar[1][1] = ar[1][0] / 12;
            ar[2][1] = ar[2][0] / 6;

            int minNode =0;
            if (ar[1][1] < ar[minNode][1]||ar[1][0]<ar[1][1]*12) {
                minNode = 1;
            }else if(ar[2][1] < ar[minNode][1]||ar[2][0]<ar[2][1]*6){
                minNode = 2;
            }

            ar[0][0] = ar[0][0] - (ar[minNode][1] * 6);
            ar[1][0] = ar[1][0] - (ar[minNode][1] * 12);
            ar[2][0] = ar[2][0] - (ar[minNode][1] * 6);

//            System.out.println("glucose");
//            for (int i = 0; i < ar.length; i++) {
//                System.out.print(ar[i][0] + " ");
//                System.out.print(ar[i][1] + " ");
//                System.out.println();
//            }

            glucose = ar[minNode][1];
        }
        if (ar[0][0] >= 1 && ar[2][0] >= 2) {
            ar[0][2] = ar[0][0];
            ar[2][2] = ar[2][0] / 2;

            int minNode = 0;
            
            if(ar[2][2] < ar[minNode][2]||ar[2][0]<ar[2][2]*2){
                minNode = 2;
            }

            ar[0][0] = ar[0][0] - ar[minNode][2];
            ar[2][0] = ar[2][0] - (ar[minNode][2] * 2);

//            System.out.println("co2");
//            for (int i = 0; i < ar.length; i++) {
//                System.out.print(ar[i][0] + " ");
//                System.out.print(ar[i][1] + " ");
//                System.out.print(ar[i][2] + " ");
//                System.out.println();
//            }
            co2 = ar[minNode][2];
        }
        if (ar[1][0] >= 2 && ar[2][0] >= 1) {
            ar[1][3] = ar[1][0] / 2;
            ar[2][3] = ar[2][0];

            int minNode = 2;
            if(ar[1][3] < ar[minNode][3]||ar[1][0]<ar[1][3]*2){
                minNode = 1;
            }
            ar[1][0] = ar[1][0] - ar[minNode][3];
            ar[2][0] = ar[2][0] - (ar[minNode][3] * 2);

//            System.out.println("h2o");
//            for (int i = 0; i < ar.length; i++) {
//                System.out.print(ar[i][0] + " ");
//                System.out.print(ar[i][1] + " ");
//                System.out.print(ar[i][2] + " ");
//                System.out.print(ar[i][3] + " ");
//                System.out.println();
//            }

            h2o = ar[minNode][3];
        }
        if (co2 == 0 && h2o == 0 && glucose == 0) {
            System.out.println("Error");
        } else {
            System.out.println(h2o + " " + co2 + " " + glucose);
        }
    }

    static int getMinNode(int[][] ar, int col) {
        int minNode = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i][col] < ar[minNode][col]) {
                minNode = i;
            }
        }
        return minNode;
    }

    static int getMinNode(int[][] ar, int col, int exceptRow) {
        int minNode = (exceptRow == 0) ? 1 : 0;
        for (int i = 0; i < ar.length; i++) {
            if ((ar[i][col] < ar[minNode][col]) && i != exceptRow) {
                minNode = i;
            }
        }
        return minNode;
    }
}
