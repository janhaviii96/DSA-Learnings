import java.util.LinkedList;

class HashTable {
    private int size;
    private LinkedList<Integer>[] table;

    // Constructor
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Insert key into hash table
    public void insert(int key) {
        int index = hash(key);
        if (!table[index].contains(key)) {
            table[index].add(key);
        }
    }

    // Search key in hash table
    public boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    // Delete key from hash table
    public void delete(int key) {
        int index = hash(key);
        table[index].remove(Integer.valueOf(key));
    }

    // Display hash table
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            for (int key : table[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }
}

