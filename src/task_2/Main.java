package task_2;

public class Main {

    public static void main(String[] args) {
        getOutput(correctData(getData(provideData())));
    }

    private static String[] provideData() {
        String[] data = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        return data;
    }

    private static String getData(String[] fixedString) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String name : fixedString) {

            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }

        String build = stringBuilder.toString();
        return build;
    }

    private static String correctData(String data) {
        String regex = "\\s*\\bonion\\b\\s*";
        String fixedString = data.replaceAll(regex, "");
        return fixedString;
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
