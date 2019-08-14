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
public class GameofStones1IRUSHI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        
        for(int y=0; y<testCases; y++){
            int total = 0;
            int games = scan.nextInt();
            for(int k=0; k<games; k++){
                int j = scan.nextInt();
                for(int a=0; a<j; a++){
                    int d = scan.nextInt();
                    total += ((d-1)/2);
                }
            }
            if(total%2 == 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
