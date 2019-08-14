/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class PaintersDilemmaIRUSHI {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        for (int i = 0; i < value; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            int t = 0;
            int b1 = 0;
            int b2 = 0;

            for (int j = 0; j < n; j++) {
                list.add(scan.nextInt()) ;
            }
            
            for (int j = 0; j < list.size(); j++) {
                boolean r = false;
                if (b1 == 0) {
                    b1 = (Integer)list.get(j);
                    t = t + 1;
                    r=true;
                }else if(list.get(j) == b1){
                    r=true;
                }
                else if (b2 == 0) {
                    b2 = list.get(j);
                    t = t + 1;
                    r=true;
                }
                else if(list.get(j) == b2){
                    r=true;
                }
                
                else {
                    
                    for (int k = j+1; k < list.size(); k++) {
                        if (list.get(k) == b1) {
                            b2 = list.get(j);
                            t = t + 1;
                            r=true;
                            break;
                        } 
                        else if (list.get(k) == b2){
                            b1 = list.get(j);
                            t = t + 1;
                            r=true;
                            break;
                        }
                    }
                    
                }
                if(r==false){
                    b1 = list.get(j);
                    t = t + 1;
                }
            }
            System.out.println(t);
        }
    }
}
