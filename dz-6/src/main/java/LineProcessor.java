import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LineProcessor {
    public static void processLines(String[] lines) {
        for (String line: lines) {
            System.out.println(line);
        }
    }

    public static void findLinesWithEvenCharacterCounts(String[] lines) {
        int count = 0;
        Set < Character > uniqueCharacters = new HashSet < > ();

        for (String line: lines) {
            // Create a map to store the count of each character
            Map < Character, Integer > charCountMap = new HashMap < > ();

            // Process each character in the line using enhanced for loop
            for (char c: line.toCharArray()) {
                // Update the count of the character in the map
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Check if each character has an even count using regular for loop
            boolean hasEvenCharacterCounts = true;
            for (int charCount: charCountMap.values()) {
                if (charCount % 2 != 0) {
                    hasEvenCharacterCounts = false;
                    break;
                }
            }

            // If we have two strings with even character counts, print them and add unique characters to the set
            if (hasEvenCharacterCounts) {
                System.out.println(line);
                count++;

                if (count == 2) {
                    char[] chars = line.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        uniqueCharacters.add(chars[i]);
                    }
                    break;
                } else {
                    char[] chars = line.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        uniqueCharacters.add(chars[i]);
                    }
                }
            }
        }

        System.out.println("\nUnique characters in the found words:");
        for (char c: uniqueCharacters) {
            System.out.print(c + " ");
        }
    }

    public static Set < Character > getUniqueLetters(String[] lines) {
        Set < Character > uniqueLetters = new HashSet < > ();

        for (String line: lines) {
            char[] chars = line.toCharArray();
            for (char c: chars) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters;
    }

    public static void main(String[] args) {
        String[] lines = {
                "мама",
                "папа",
                "їж їжак желе"
        };
        System.out.println("Input parameter is an array of strings:");
        processLines(lines);

        System.out.println("\n1st results of finding:");
        findLinesWithEvenCharacterCounts(lines);

        System.out.println("\nUnique letters in the found words (order doesn't matter):");
        Set < Character > uniqueLetters = getUniqueLetters(lines);
        for (char c: uniqueLetters) {
            System.out.print(c + " ");
        }
    }
}