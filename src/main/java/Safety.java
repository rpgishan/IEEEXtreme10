/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author Gishan
 */
public class Safety {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pw = reader.readLine();
        char[] pac = pw.toCharArray();
        char[] duppac = pac;
        int nc = Integer.valueOf(reader.readLine());
        int[][] arr = new int[nc][4];
        LinkedList<Character> result = new LinkedList<Character>();
        for (int i = 0; i < nc; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
            if(arr[i][0]==1){
                boolean dif = true;
                char res = 'Y';
                for (int j = arr[i][1]-1, k=arr[i][3]-1; j < arr[i][2]; j++,k++) {
                    if(duppac[j]!=duppac[k]){
                        dif=false;
                        res = 'N';
                        break;
                    }
                }
                result.add(res);
            }else if(arr[i][0]==2){
                for (int j = arr[i][1]-1, k=arr[i][3]-1; j < arr[i][2]; j++,k++) {
                    duppac[j]=pac[k];
                }
            }else{
                for (int j = arr[i][1]-1; j < arr[i][2]; j++) {
                    duppac[j] = (duppac[j]!='z')?(char)(duppac[j]+1):'a';
                }
            }
        }
        for (Character character : result) {
            System.out.println(character);
        }
    }
}
