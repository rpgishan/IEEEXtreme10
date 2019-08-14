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
public class NPalindromes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String[] name = new String[num];
        int[] shifts = new int[num];
        for (int i = 0; i < num; i++) {
            shifts[i] = s.nextInt();
            name[i] = s.nextLine();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 26; j++) {
        char[] namech = name[i].toCharArray();
                for (int k = 0; k < shifts[i]*namech.length; k++) {
                    namech[k]=shiftc(namech[k]);
                }
            }
        }
    }
    static char shiftc(char letter){
        return (letter=='z')?'a':(char)(letter+1);
    }
}
