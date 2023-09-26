package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Algorithms {

    public String readFromFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);

        if (!f.exists()) {
            System.out.println("File not exits!");
        }
        String s = "";
        while (sc.hasNext()) {
            s += sc.nextLine();
        }
        return s;

    }

    public void writeToFile(String fileName, String s) throws IOException {
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.append(s);
        pw.close();
        System.out.println("Write to file successfully!");
    }

    public String normalizeProcess(String s) {
        boolean isFirstLine = true;
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll(" ,", ",");
        s = s.replaceAll(" \\.", ".");
        s = s.replaceAll(" :", ":");

        // Remove spaces before and after quotes
        s = s.replaceAll("\\s+\"(.*?)\"\\s+", "\"$1\"");

        // Remove spaces before and after commas and dots
        s = s.replaceAll("\\s+,", ",");
        s = s.replaceAll("\\s+\\.", ".");
        if (isFirstLine) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            isFirstLine = false;
        }
        return s;
    }
}
