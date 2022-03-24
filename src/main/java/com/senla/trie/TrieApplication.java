package com.senla.trie;


import com.senla.trie.runner.Runner;
import com.senla.trie.trie.Trie;

import java.io.*;

public class TrieApplication {

	public static void main(String[] args) throws IOException {
		Runner runner = new Runner();
		if(args.length == 0){
			throw new RuntimeException("You did not specify the path to the file");
		}
		Trie trie = runner.getWordsFromFile(args[0]);
		runner.getAllWordsInText(trie);
		runner.getWordCount(trie);
	}

}
