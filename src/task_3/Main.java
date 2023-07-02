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

    private static String dataIn() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine().trim();
        return result;
    }

    private static String formAnswer() {

        System.out.println("Enter name: ");
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String input = dataIn();
        for (String name : providedData()) {
            if (name.equalsIgnoreCase(input)) {
                cnt++;
            }
        }
        if (cnt == 0) {
            throw new NoSuchElementException("There is no such name in the list");
        }
        sb.append("Name: [")
                .append(input)
                .append("] was found")
                .append(cnt)
                .append(" times");

        return sb.toString();
    }


}
