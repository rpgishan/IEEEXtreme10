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
public class InitSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int studs = s.nextInt();
        long[][] q = new long[studs][3];
        long[] count = new long[studs];
        for (int i = 0; i < studs; i++) {
            q[i][0] = s.nextLong();
            q[i][1] = s.nextLong();
            q[i][2] = s.nextLong();
        }
        for (int i = 0; i < studs; i++) {
            for (long j = q[i][1]; j <= q[i][2]; j++) {
                    System.out.println("gcd = "+gcd(j, q[i][0]));
                if (gcd(j, q[i][0]) == 1) {
                    count[i] += j;
                }
            }
            count[i] = count[i] % 1000000007;
            System.out.println(count[i]);
        }

    }
    
    public static long gcd(long p, long q) {
        if (q == 0) return p;
        if (p == 0) return q;

        if ((p & 1) == 0 && (q & 1) == 0) return gcd(p >> 1, q >> 1) << 1;

        else if ((p & 1) == 0) return gcd(p >> 1, q);

        else if ((q & 1) == 0) return gcd(p, q >> 1);

        else if (p >= q) return gcd((p-q) >> 1, q);

        else return gcd(p, (q-p) >> 1);
    }

//    private static long gcd(long a, long b) {
//        while (b > 0) {
//            long temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
   
}
