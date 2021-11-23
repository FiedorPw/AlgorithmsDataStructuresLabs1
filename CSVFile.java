package com.company.lab6;

import java.io.*;

public class CSVFile {
    public static void main(String[] args){
        readCSVFile();
    }

    public static void readCSVFile(){

        String path = "C:\\Users\\Miki\\Desktop\\Zeszyt1.csv";
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");

                System.out.println(line);

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
