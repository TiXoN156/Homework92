package com.company;

import java.util.HashMap;
import java.util.Map;

public class SwapHashMap<K, V> {
    HashMap<K, V> hashMap = new HashMap<>();
    HashMap<V, K> swapHashMap = new HashMap<V, K>();

    public SwapHashMap(HashMap<K, V> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<V, K> getSwapHashMap(){
        for (Map.Entry<K, V> entry : hashMap.entrySet()){
            swapHashMap.put(entry.getValue(), entry.getKey());
        }
        return swapHashMap;
    }

}
