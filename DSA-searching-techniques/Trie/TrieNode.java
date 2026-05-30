class TrieNode {
    TrieNode[] children = new TrieNode[26]; // assuming lowercase a-z
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

