package task_3;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(task_2.Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("\n" + formAnswer());

    }

    private static String[] providedData() {
        String[] data = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        return data;
    }

}
