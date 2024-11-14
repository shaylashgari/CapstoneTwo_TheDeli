package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    // this is where the buff writer, inside order class call file manager to write csv
    // copy and paste from last capstone
    // where you would have buffer writer

    public static void saveOrder(String reciept){


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String formattedDate = dateFormatter.format(LocalDateTime.now());
        String fileName = "reciept" + formattedDate + ".txt";

        try{



            BufferedWriter writeOrder = new BufferedWriter(new FileWriter("Order.csv"));
            writeOrder.write(reciept);



            writeOrder.close();

        }catch (IOException e){e.printStackTrace();}


    }


    // do try catch
}
