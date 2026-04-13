package hm_pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class POM_CLS {

    public static String readDataFromTxtFile(String filepath) {
        String result = "";

        try {
            Scanner scanner = new Scanner(new File(filepath));

            while (scanner.hasNextLine()) {
                result += scanner.nextLine();
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}