package com.senla.trie.trie;

import com.senla.trie.node.TrieNode;


public class Trie implements AbstractTrie {

    private final TrieNode trieNodeRoot;

    public Trie() {
        this.trieNodeRoot = new TrieNode();
    }

    public TrieNode getTrieNodeRoot() {
        return trieNodeRoot;
    }

    public void insert(String word) {
        TrieNode currentTrieNode = this.trieNodeRoot;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            TrieNode nextTrieNode = currentTrieNode.getNodeMap().get(letter);
            if (nextTrieNode == null) {
                nextTrieNode = new TrieNode();
                currentTrieNode.getNodeMap().put(letter, nextTrieNode);
            }
            currentTrieNode = nextTrieNode;
        }
        currentTrieNode.setWord(true);
        currentTrieNode.setCounter(currentTrieNode.getCounter() + 1);
    }

    public int getWordCount(String word){
        TrieNode currentTrieNode = this.trieNodeRoot;
        for(int i = 0; i< word.length(); i++){
            char letter = word.charAt(i);
            TrieNode nextTrieNode = currentTrieNode.getNodeMap().get(letter);
            if(nextTrieNode == null){
                return 0;
            }
            currentTrieNode = nextTrieNode;
        }
        return currentTrieNode.getCounter();
    }

    public int getTextWords(TrieNode trieNodeRoot) {

        int result = 0;

        if (trieNodeRoot.isWord()) {
            result++;
        }

        for (char i : trieNodeRoot.getNodeMap().keySet()) {
            TrieNode childrenNode = trieNodeRoot.getNodeMap().get(i);
            result += getTextWords(childrenNode);
        }
        return result;
    }


}