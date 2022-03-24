package com.senla.trie;


import com.senla.trie.runner.Runner;
import com.senla.trie.trie.Trie;

import java.io.*;

public class TrieApplication {

	public static void main(String[] args) throws IOException {
		Runner runner = new Runner();
		Trie trie = runner.getWordsFromFile();
		runner.getAllWordsInText(trie);
		runner.getWordCount(trie);
	}

}
