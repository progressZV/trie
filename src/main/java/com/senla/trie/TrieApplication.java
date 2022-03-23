package com.senla.trie;


import com.senla.trie.runner.Runner;
import com.senla.trie.trie.Trie;

import java.io.*;

public class TrieApplication {

	public static void main(String[] args) throws IOException {
		Runner runner = new Runner();
		Trie trie = runner.getWordsFromFile();
		System.out.println("There are " + trie.getTextWords(trie.getTrieNodeRoot()) + " unique words in txt.");
		String msg = "fsg";
		System.out.println("Word '" + msg + "' appears " + trie.getWordCount(msg) + " times.");
	}

}
