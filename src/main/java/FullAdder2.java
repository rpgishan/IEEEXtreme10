/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;

/**
 *
 * @author Gishan
 */
public class FullAdder2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> anslist = new LinkedList<String>();
        anslist.add(reader.readLine());
        String[] pw = anslist.peekFirst().split(" ");
        int base = Integer.parseInt(pw[0]), sign = 0, maxlength = 0, a = 0, b = 0, chartot, cadd = 0, cremainder = 0;
        boolean found1 = false, found2 = false;
        BigInteger total = new BigInteger("0");
        char[] key = pw[1].toCharArray();
        char[] charline1 = null, charline2 = null;
        LinkedList<BigInteger> numlist = new LinkedList<BigInteger>();
        LinkedList<Character> charlist = new LinkedList<Character>();

        String line = reader.readLine();
        anslist.add(line);
        String[] line2 = line.split(" ");
        charline1 = line2[line2.length - 1].toCharArray();
//        charline1 = line.toCharArray();
        line = reader.readLine();
        anslist.add(line);
        String[] line3 = line.split(" ");
        charline2 = line3[line3.length - 1].toCharArray();
        line = reader.readLine();
        anslist.add(line);
        int minLength;
        if (charline1.length < charline2.length) {
            minLength = charline1.length;
            int k = charline2.length - 1;
            for (int i = minLength - 1; i >= 0; i--, k--) {
                found1 = false;
                found2 = false;
                a = 0;
                b = 0;
                for (int j = 0; j < key.length && (!found1 || !found2); j++) {
                    if (charline1[i] == key[j]) {
                        a = j;
                        found1 = true;
                    }
                    if (charline2[k] == key[j]) {
                        b = j;
                        found2 = true;
                    }
                }
                chartot = cadd + a + b;
                if (chartot >= base) {
                    cremainder = chartot - base;
                    cadd = 1;
                } else {
                    cremainder = chartot;
                    cadd = 0;
                }
//                System.out.println("char1 if1 remainder : " + cremainder);
                charlist.addFirst(key[cremainder]);
            }
            if ((charline1.length == charline2.length) && cadd != 0) {
                charlist.add(key[cadd]);
            } else {
//                k++;
                for (; k >= 0; k--) {
                    b = 0;
                    for (int j = 0; j < key.length; j++) {
                        if (charline2[k] == key[j]) {
                            b = j;
                            break;
                        }
                    }
                    chartot = cadd + b;
                    if (chartot >= base) {
                        cremainder = chartot - base;
                        cadd = 1;
                    } else {
                        cremainder = chartot;
                        cadd = 0;
                    }
//                    System.out.println("char1 if2 remainder : " + cremainder);
                    if (k == 0 && cremainder == 0) {
                        break;
                    }
                    charlist.addFirst(key[cremainder]);
                }
            }
        } else {
            minLength = charline2.length;
            int k = charline1.length - 1;
            for (int i = minLength - 1; i >= 0; i--, k--) {
                found1 = false;
                found2 = false;
                a = 0;
                b = 0;
                for (int j = 0; j < key.length && (!found1 || !found2); j++) {
                    if (charline1[k] == key[j]) {
                        a = j;
//                System.out.println("char2 a : " + a);
                        found1 = true;
                    }
                    if (charline2[i] == key[j]) {
                        b = j;
//                System.out.println("char2 b : " + b);
                        found2 = true;
                    }
                }
//                System.out.println("char2 cadd : " + cadd);
                chartot = cadd + a + b;
//                System.out.println("char2 chartot : " + chartot);
                if (chartot >= base) {
                    cremainder = chartot - base;
                    cadd = 1;
                } else {
                    cremainder = chartot;
                    cadd = 0;
                }
//                System.out.println("char2 if1 remainder : " + cremainder);
//                System.out.println("char2 if1 char : " + key[cremainder]);
                charlist.addFirst(key[cremainder]);
//                System.out.println("if2 bottom i = "+i);
//                System.out.println("if2 bottom k = "+k);
            }
            if ((charline1.length == charline2.length) && cadd != 0) {
                charlist.add(key[cadd]);
//                System.out.println("if ran");
            } else {
//                System.out.println("else");
                // k++;
//                    System.out.println("else char2 up k = "+k);
                for (; k >= 0; k--) {
                    a = 0;
                    for (int j = 0; j < key.length; j++) {
                        if (charline1[k] == key[j]) {
//                            System.out.println("char2 else a = "+a);
                            a = j;
                            break;
                        }
                    }
//                    System.out.println("char2 cadd : " + cadd);
                    chartot = cadd + a;
                    if (chartot >= base) {
                        cremainder = chartot - base;
                        cadd = 1;
                    } else {
                        cremainder = chartot;
                        cadd = 0;
                    }
//                    System.out.println("char2 if2 remainder : " + cremainder);
//                    System.out.println("char2 if2 char : " + key[cremainder]);
//                    System.out.println("char 2 k = "+k);
                    if (k == 0 && cremainder == 0) {
                        break;
                    }
                    charlist.addFirst(key[cremainder]);
                }
            }
        }

        for (String ansline : anslist) {
            System.out.println(ansline);
        }
        System.out.print(" ");
        // LinkedList<Integer> nums = getInts(total, base);
        for (Character charline : charlist) {
            System.out.print(charline);
        }
    }

}
