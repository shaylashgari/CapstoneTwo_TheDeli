package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    // this is where the buff writer, inside order class call file manager to write csv
    // copy and paste from last capstone
    // where you would have buffer writer

    public static void saveOrder(Order order){
        try{

            BufferedWriter writeOrder = new BufferedWriter(new FileWriter("Order.csv"));
            // only writing




            writeOrder.close();

        }catch (IOException e){e.printStackTrace();}


    }


    // do try catch
}
