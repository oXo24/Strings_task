package task_1;

public class Main {

    public static void main(String[] args) {
        getOutput(correctData(getData(provideData())));
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

    private static String correctData(String data) {
        String fixedString = data.replace("b", "o");
        return fixedString;
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

