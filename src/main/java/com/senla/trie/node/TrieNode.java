package com.senla.trie.node;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	private final Map<Character, TrieNode> nodeMap;
	private int counter;

	public TrieNode(){
		this.nodeMap = new HashMap<>();
	}

	public Map<Character, TrieNode> getNodeMap() {
		return nodeMap;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}