package task_2;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static final String exception = "onion";

    private  static void main(String[] args) {

    }

    private static String[] providedData() {
        String[] data = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        return data;
    }

    private static String processData(String[] data) {

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (String name: data) {
            if (!name.equalsIgnoreCase(exception)) {
                sb.append(cnt++)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }
        }
        return sb.toString();
    }


}
