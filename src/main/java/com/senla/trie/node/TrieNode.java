package com.senla.trie.node;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	Map<Character, TrieNode> nodeMap;
	boolean isWord;

	public TrieNode(){
		 this.nodeMap = new HashMap<>();
	 }

	public Map<Character, TrieNode> getNodeMap() {
		return nodeMap;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean word) {
		isWord = word;
	}
}
