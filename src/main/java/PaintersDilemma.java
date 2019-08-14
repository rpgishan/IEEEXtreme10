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
public class PaintersDilemma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] opar = new int[t];
        int[] br = new int[2];
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] c = new int[n];
            for (int j = 0; j < n; j++) {
                c[j] = s.nextInt();
            }
            
        }
    }
}
