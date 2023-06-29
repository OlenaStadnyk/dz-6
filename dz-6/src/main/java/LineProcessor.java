public class LineProcessor {
    public static void processLines(String[] lines) {
        // Iterate over each line in the array
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String[] lines = {"мама", "папа", "їж їжак желе"};
        processLines(lines);
    }
}
