import java.util.*;

public class List {

    public static void main(String[] args) {
        // 1. Add and retrieve elements from ArrayList and LinkedList
        System.out.println("1. ArrayList and LinkedList Operations:");

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Green");

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Circle");
        linkedList.add("Square");
        linkedList.add("Triangle");

        // Display elements
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Retrieve elements
        System.out.println("First element in ArrayList: " + arrayList.get(0));
        System.out.println("First element in LinkedList: " + linkedList.get(0));

        // 2. Demonstrate insertion order and sorting in TreeSet
        System.out.println("\n2. TreeSet Demonstration:");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(5);

        System.out.println("TreeSet (sorted order): " + treeSet);

        // 3. Use a HashMap to store and retrieve student details
        System.out.println("\n3. HashMap for Student Details:");

        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
