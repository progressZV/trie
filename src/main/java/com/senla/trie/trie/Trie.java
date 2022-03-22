package com.senla.trie.trie;

import com.senla.trie.node.TrieNode;

public class Trie {

	private final TrieNode trieNodeRoot;

	public Trie() {
		this.trieNodeRoot = new TrieNode();
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
	}

	public int wordCount(TrieNode trieNodeRoot) {

		int result = 0;

		if (trieNodeRoot.isWord()) {
			result++;
		}

		for (char i = 'a'; i <= 'z'; i++) {
			TrieNode childrenNode = trieNodeRoot.getNodeMap().get(i);
			if (childrenNode != null) {
				result += wordCount(childrenNode);
			}
		}
		return result;
	}
}
