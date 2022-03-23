package com.senla.trie.trie;

import com.senla.trie.node.TrieNode;

public interface AbstractTrie {
    void insert(String word);
    int getWordCount(String word);
    int getTextWords(TrieNode trieNode);
}
