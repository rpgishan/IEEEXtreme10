/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class MemoryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] res = new String[t];
        int[] rei = new int[t];
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt(), s = sc.nextInt(), n = sc.nextInt();
            LinkedList<Integer> fifo = new LinkedList<>();
            LinkedList<Integer> lru = new LinkedList<>();
            int[] sar = new int[n];
            for (int j = 0; j < n; j++) {
                sar[j] = sc.nextInt() / s;
                if(!fifo.isEmpty()){
                    fifo.add(sar[j]);
                }else if(fifo.remove(sar[j]+"")){
                    fifo.add(sar[j]);
                }
            }
            
        }
    }
}
