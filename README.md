import java.util.*;

public class CollectionTasks {

    public static void main(String[] args) {
        // 1. Count the frequency of each word in a given sentence
        System.out.println("1. Word Frequency Count:");
        String sentence = "hello world hello java world java hello";
        countWordFrequency(sentence);

        // 2. Find duplicate elements in an ArrayList
        System.out.println("\n2. Find Duplicate Elements in ArrayList:");
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Bob", "David"));
        findDuplicatesInArrayList(names);

        // 3. Remove duplicates from a list of integers using HashSet
        System.out.println("\n3. Remove Duplicates Using HashSet:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 6);
        removeDuplicatesUsingHashSet(numbers);
    }

    // Method to count the frequency of each word in a sentence using HashMap
    public static void countWordFrequency(String sentence) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to find duplicate elements in an ArrayList
    public static void findDuplicatesInArrayList(ArrayList<String> list) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String item : list) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }

    // Method to remove duplicates from a list of integers using HashSet
    public static void removeDuplicatesUsingHashSet(List<Integer> list) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println("Original List: " + list);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
