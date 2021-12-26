package com.bridgelabs.hashmap;

public class MyHashMapMain {

    public static void main(String[] args) {

        String sentence = "to be or not to be";
        MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word: words) {
            myHashMap.get(word);
            Integer value = myHashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word,value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
    }

}