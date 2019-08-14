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
public class GoldbachsSecondConjecture {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        LinkedList<Long> prlist = primeNo(num);
//        for (Long long1 : prlist) {
//            System.out.println(long1);
//        }
        F1:
        for (int i = prlist.size() - 1; i >= 0; i--) {
            for (int j = prlist.size() - 1; j >= 0; j--) {
                for (int k = prlist.size() - 1; k >= 0; k--) {
                    if ((prlist.get(i) + prlist.get(j) + prlist.get(k)) == num) {
                        System.out.println(prlist.get(i) + " " + prlist.get(j) + " " + prlist.get(k));
                        break F1;
                    }
                }
            }
        }
    }

    static LinkedList<Long> primeNo(long uplimit) {
        long i = 0;
        long num = 0;
        //Empty String
        LinkedList<Long> primelist = new LinkedList<Long>();

        for (i = 1; i <= uplimit; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primelist.add(i);
            }
        }
        return primelist;
    }
}
