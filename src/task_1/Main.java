package task_1;

public class Main {

    public static void main(String[] args) {
    }

    private static String[] provideData() {
        String[] data = {"brange", "plum", "tomato", "onibn", "grape"};
        return data;
    }
    private static String getData(String[] items) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : items) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }

        return stringBuilder.toString();
    }
}

