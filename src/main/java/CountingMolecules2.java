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
public class CountingMolecules2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[3];
        int[][] arrem = new int[3][4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int h2o = 0, co2 = 0, glucose = 0;
        
        h2o = (ar[1]+(2*ar[2])-(4*ar[0]))/4;
        co2 = ((2*ar[2])-ar[1])/4;
        glucose = ((4*ar[0])+ar[1]-(2*ar[2]))/24;
        
        arrem[0][0] = ar[0]-(glucose*6+co2);
        arrem[1][0] = ar[1]-(glucose*12+h2o*2);
        arrem[2][0] = ar[2]-(glucose*6+co2*2);
        
        
        if (arrem[0][0] >= 6 && arrem[1][0] >= 12 && arrem[2][0] >= 6) {
            arrem[0][1] = arrem[0][0] / 6;
            arrem[1][1] = arrem[1][0] / 12;
            arrem[2][1] = arrem[2][0] / 6;

            int minNode =0;
            if (arrem[1][1] < arrem[minNode][1]||arrem[1][0]<arrem[1][1]*12) {
                minNode = 1;
            }else if(arrem[2][1] < arrem[minNode][1]||arrem[2][0]<arrem[2][1]*6){
                minNode = 2;
            }

            arrem[0][0] = arrem[0][0] - (arrem[minNode][1] * 6);
            arrem[1][0] = arrem[1][0] - (arrem[minNode][1] * 12);
            arrem[2][0] = arrem[2][0] - (arrem[minNode][1] * 6);

            glucose += arrem[minNode][1];
        }
        if (arrem[0][0] >= 1 && arrem[2][0] >= 2) {
            arrem[0][2] = arrem[0][0];
            arrem[2][2] = arrem[2][0] / 2;

            int minNode = 0;
            
            if(arrem[2][2] < arrem[minNode][2]||arrem[2][0]<arrem[2][2]*2){
                minNode = 2;
            }

            arrem[0][0] = arrem[0][0] - arrem[minNode][2];
            arrem[2][0] = arrem[2][0] - (arrem[minNode][2] * 2);

            co2 += arrem[minNode][2];
        }
        if (arrem[1][0] >= 2 && arrem[2][0] >= 1) {
            arrem[1][3] = arrem[1][0] / 2;
            arrem[2][3] = arrem[2][0];

            int minNode = 2;
            if(arrem[1][3] < arrem[minNode][3]||arrem[1][0]<arrem[1][3]*2){
                minNode = 1;
            }
            arrem[1][0] = arrem[1][0] - arrem[minNode][3];
            arrem[2][0] = arrem[2][0] - (arrem[minNode][3] * 2);


            h2o += arrem[minNode][3];
        }

        if (co2 <= 0 && h2o <= 0 && glucose <= 0) {
            System.out.println("Error");
        } else {
            System.out.println(h2o + " " + co2 + " " + glucose);
        }
    }
}
