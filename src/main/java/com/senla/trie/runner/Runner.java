package com.senla.trie.runner;

import com.senla.trie.trie.Trie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Runner {

    public Trie getWordsFromFile() throws IOException {
        Trie trie = new Trie();
        String word;

        try (FileReader fileReader = new FileReader("words.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            while((word = bufferedReader.readLine()) != null){
                String[] words = word.split("[ \\.,]+");
                for (String s : words) trie.insert(s);
            }
        }
        return trie;
    }

}
