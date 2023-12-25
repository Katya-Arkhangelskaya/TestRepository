package lesson8.tech.skelar.TestRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyHomework {
    private static final Logger logger = Logger.getLogger(MyHomework.class.getName());

    public static void main(String[] args) {
        configLogger();

        try {
            processFile("nonexistent_file.txt");
        } catch (IOException e) {
            logException(e);
        }

        // execution of unchecked Exception
        try {
            triggerUncheckedException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }

    private static void configLogger() {
        try {
            FileHandler fileHandler = new FileHandler("exception_log.txt");
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // data processing and output
                System.out.println(line);
            }
        }
    }

    private static void triggerUncheckedException() {
        // generation of unchecked Exception
        String str = null;
        System.out.println(str.length());
    }

    private static void logException(Exception e) {
        // logging Exception
        logger.log(Level.SEVERE, "Exception occurred", e);
    }
}
