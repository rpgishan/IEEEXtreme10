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
public class FullAdder {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> anslist = new LinkedList<String>();
        anslist.add(reader.readLine());
        String[] pw = anslist.peekFirst().split(" ");
        int base = Integer.parseInt(pw[0]), sign = 0, maxlength = 0;
        BigInteger total = new BigInteger("0");
        char[] key = pw[1].toCharArray();
        LinkedList<BigInteger> numlist = new LinkedList<BigInteger>();
        String line = reader.readLine();
        while (!line.contains("???")) {
            anslist.add(line);

            if (line.startsWith("+")) {
                sign = 1;
                line = line.substring(1, line.length());
            } else if (line.startsWith("-")) {
                maxlength = line.length();
                line = reader.readLine();
                continue;
            }
//            else if(line.startsWith("-")){
//                sign =2;
//                line = line.substring(1, line.length());
//            }
            char[] charline = line.toCharArray();
            StringBuilder sbline = new StringBuilder();
            for (int i = 0; i < charline.length; i++) {
                for (int j = 0; j < key.length; j++) {
                    if (charline[i] == key[j]) {
                        sbline.append(j);
                        break;
                    }
                }
            }
            numlist.add(new BigInteger(sbline.toString()));

            line = reader.readLine();
        }
//        if(sign==1){
        for (BigInteger bigInt : numlist) {
            total = total.add(bigInt);
           // System.out.println("bigint : " + bigInt);
        }
//        }else if(sign==2){
//            for (Integer integer : numlist) {
//                total+=integer;
//            }
//        }
        LinkedList<String> totlist = new LinkedList<String>();

        for (String ansline : anslist) {
            System.out.println(ansline);
        }
        BigInteger num = total;
       // System.out.println("tot : " + total);
//        System.out.println("num : " + num);
        while (!num.divide(new BigInteger(base + "")).equals(new BigInteger("0"))) {
//            System.out.println("wloop in : " + num.divide(new BigInteger(base + "")));
            totlist.addFirst(key[num.mod(new BigInteger(base + "")).intValue()] + "");
            num = num.divide(new BigInteger(base + ""));
        }
        totlist.addFirst(key[num.intValue()] + "");
        System.out.print(" ");
        // LinkedList<Integer> nums = getInts(total, base);
        for (String totline : totlist) {
            System.out.print(totline);
        }
    }
    
    static BigInteger getAddition(BigInteger x,BigInteger y, int b){
        String tot="";
        
        return new BigInteger(tot);
    }

}
