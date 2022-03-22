package com.senla.trie;


import com.senla.trie.trie.Trie;

import java.io.*;

public class TrieApplication {

	public static void main(String[] args) throws IOException {
		Trie trie = getWordsFromFile();
	}

	private static Trie getWordsFromFile() throws IOException {
		Trie trie = new Trie();
		final File file = new File("words.txt");
		String word;

		try (FileReader fileReader = new FileReader(file);
			 BufferedReader bufferedReader = new BufferedReader(fileReader)){

			while((word = bufferedReader.readLine()) != null){
				trie.insert(word);
			}

		}
		return trie;
	}

}
