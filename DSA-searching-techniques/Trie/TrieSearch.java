public class TrieSearch {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert car names
        trie.insert("audi");
        trie.insert("bmw");
        trie.insert("benz");
        trie.insert("toyota");
        trie.insert("tata");

        // Search for car names
        System.out.println("Search 'audi': " + trie.search("audi"));     // true
        System.out.println("Search 'bmw': " + trie.search("bmw"));       // true
        System.out.println("Search 'benz': " + trie.search("benz"));     // true
        System.out.println("Search 'tesla': " + trie.search("tesla"));   // false

        // Prefix check
        System.out.println("StartsWith 'to': " + trie.startsWith("to")); // true (toyota)
        System.out.println("StartsWith 'ta': " + trie.startsWith("ta")); // true (tata)
        System.out.println("StartsWith 'fo': " + trie.startsWith("fo")); // false
    }
}

/*
Complexity:
Insert: O(m) where m = length of word
Search: O(m)
Prefix check: O(m)
Space: O(26 * n * m) in worst case (n words, each length m)
*/
