package Vorlesung;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class FileFinder {

    public static void listFiles(File folder, String filename) {

        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.getName().contains(filename)) {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path:");
        String path = scanner.nextLine();
        File folder = new File(path);
        System.out.print("Enter the file you want to find:");
        String filename = scanner.nextLine();
        listFiles(folder, filename);
    }

}
