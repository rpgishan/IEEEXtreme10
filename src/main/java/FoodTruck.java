/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Gishan
 */
public class FoodTruck {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String latlang = s.nextLine(), line;
        String[] latlngsar = latlang.split(",");
        LinkedList<String> datalinelist = new LinkedList<>();
        double ftlat = Double.parseDouble(latlngsar[0]), ftlng = Double.parseDouble(latlngsar[1]), r = s.nextDouble();
        s.nextLine();
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//String line;
//        while (((line = bfr.readLine()) != null)||line.equals("")||line.equals("\n")) {
////            System.out.println(line);
//            datalinelist.add(line);
//        }
//        while (s.hasNextLine() && !line.equals("") && line.endsWith(line.substring(0))) {
//            datalinelist.add(s.nextLine());
//            line = s.nextLine();
//        }

//        Console console = System.console();
//        while (console!=null) {
//            datalinelist.add(console.readLine());
////            line = s.nextLine();
//        }


        System.out.println("ftlat : " + ftlat + " ftlng : " + ftlng + " r : " + r);
        for (String dataline : datalinelist) {
            System.out.println(dataline);
        }

    }
}
