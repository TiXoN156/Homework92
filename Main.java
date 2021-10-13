package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Первая строка", 1);
        hashMap.put("Вторая строка", 2);
        hashMap.put("Третяя строка", 3);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
        }

        HashMap<Integer, String> swapHashMap = (new SwapHashMap<String, Integer>(hashMap)).getSwapHashMap();

        for (Map.Entry<Integer, String> entry : swapHashMap.entrySet()){
            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
        }

    }
}
