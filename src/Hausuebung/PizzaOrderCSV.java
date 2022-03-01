package Hausuebung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaOrderCSV {
    public static void main(String[] args) {
        String FILE = "data/PizzaMenue.csv";
        File file = new File(FILE);
        Scanner myReader;
        {
            try {
                myReader = new Scanner(file);
                while (myReader.hasNextLine()){
                    String line = myReader.nextLine();
                    String[] items = line.split(",");
                    ArrayList<String> pizza = new ArrayList<>(Arrays.asList(items));

                    for (String c : items){
                        System.out.println(c);
                    }
                }
                myReader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

