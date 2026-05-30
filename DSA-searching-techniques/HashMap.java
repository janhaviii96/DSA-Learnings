public class HashMap {
    public static void main(String[] args) {
        // Create a HashMap (key = String, value = Integer)
        java.util.HashMap<String, Integer> ages = new java.util.HashMap<>();

        // Insert key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        // Display the HashMap
        System.out.println("HashMap contents: " + ages);

        // Search for a key
        String key = "Bob";
        if (ages.containsKey(key)) {
            System.out.println(key + "'s age: " + ages.get(key));
        } else {
            System.out.println(key + " not found in HashMap");
        }

        // Update a value
        ages.put("Alice", 26); // overwrites old value
        System.out.println("Updated Alice's age: " + ages.get("Alice"));

        // Remove a key-value pair
        ages.remove("Charlie");
        System.out.println("After removing Charlie: " + ages);

        // Iterate through HashMap
        System.out.println("Iterating through HashMap:");
        for (String name : ages.keySet()) {
            System.out.println(name + " -> " + ages.get(name));
        }
    }
}

/*
Complexity:
Average Case: O(1) for insert, search, delete
Worst Case: O(n) if many collisions
Space: O(n) for storing key-value pairs
*/
