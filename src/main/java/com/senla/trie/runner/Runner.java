package com.senla.trie.runner;

import com.senla.trie.trie.Trie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public Trie getWordsFromFile() throws IOException {
        Trie trie = new Trie();
        String word;

        try (FileReader fileReader = new FileReader("The Hunger Games.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while((word = bufferedReader.readLine()) != null){
                String[] words = word.split("[ \\.,!?]+");
                for (String s : words) trie.insert(s.toLowerCase());
            }
        }

/*        Path path = Paths.get("words.txt");
        Files.lines(path).flatMap(s -> Arrays.stream(s.split("[ \\.,]+"))).forEach(trie::insert);*/

        return trie;
    }

    public void getAllWordsInText(Trie trie){
        System.out.println("There are " + trie.getTextWords(trie.getTrieNodeRoot()) + " words in txt.");
    }

    public void getWordCount(Trie trie){
        System.out.println("Enter the word whose quantity you need to find: ");
        Scanner in = new Scanner(System.in);
        String msg = in.next();
        System.out.println("Word '" + msg + "' appears " + trie.getWordCount(msg) + " times.");
    }

}
