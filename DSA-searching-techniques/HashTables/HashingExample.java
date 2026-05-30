public class HashingExample {
    public static void main(String[] args) {
        HashTable ht = new HashTable(7); // Hash table of size 7

        // Insert elements
        ht.insert(10);
        ht.insert(20);
        ht.insert(15);
        ht.insert(7);
        ht.insert(22);

        System.out.println("Hash Table:");
        ht.display();

        // Search for a key
        int key = 15;
        if (ht.search(key)) {
            System.out.println("Key " + key + " found in hash table");
        } else {
            System.out.println("Key " + key + " not found in hash table");
        }

        // Delete a key
        ht.delete(20);
        System.out.println("After deleting 20:");
        ht.display();
    }
}

/*
Complexity:
Average Case: O(1) for insert, search, delete
Worst Case: O(n) if many collisions (all elements in one bucket)
Space: O(n)
*/
