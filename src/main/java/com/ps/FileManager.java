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

            // modify line 17 based on what you want to display in csv file

            BufferedWriter writeOrder = new BufferedWriter(new FileWriter("Order.csv"));
            // loop through all products and print them into the csv file




            writeOrder.close();

        }catch (IOException e){e.printStackTrace();}


    }


    // do try catch
}
