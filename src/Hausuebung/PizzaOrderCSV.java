//package Hausuebung;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PizzaOrderCSV {
//    public static void main(String[] args) {
//        java.util.Scanner scanner = new java.util.Scanner((System.in));
//
//        String FILE = "data/PizzaMenue.csv";
//        File file = new File(FILE);
//        Scanner myReader;
//        {
//            try {
//                myReader = new Scanner(file);
//                while (myReader.hasNextLine()) {
//                    String line = myReader.nextLine();
//                    ArrayList<Pizza> pizzaList = new ArrayList<>();
//                    String[] pizzaAttributes = line.split(",");
//                    new Pizza(pizzaAttributes[0], Double.parseDouble(pizzaAttributes[1]));
//                    while (pizzaList.add(new Pizza(pizzaAttributes[0], pizzaAttributes[1])))
//
//
//                    ArrayList<String> pizzaOrder = new ArrayList<>();
//
//                    String pizzaInput = "";
//                    while (!pizzaInput.equals("x")) {
//                        System.out.println("Enter the Pizza(s) you want to order.");
//                        System.out.println("Write x when you are finished.");
//                        System.out.print("Pizza: ");
//                        pizzaInput = scanner.nextLine();
//                        if (pizzaList.getName().equals(pizzaInput) {
//                            pizzaOrder.add(pizza);
//                        }
//                    //That does not work
//
//                    for (String c : pizzaOrder) {
//                        System.out.println(c);
//                    }
//
//                }
//                myReader.close();
//
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
//
