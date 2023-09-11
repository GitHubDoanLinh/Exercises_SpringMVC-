package services;

import models.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryService {


    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1,new Dictionary("hello","Xin chao"));
        dictionaries.put(2,new Dictionary("goodbye", "Tam biet"));
        dictionaries.put(3,new Dictionary("Johnson", "Thang do te"));
        dictionaries.put(4,new Dictionary("Nixon","Thang sat nhan"));
        dictionaries.put(5,new Dictionary("banana", "qua chuoi"));
        dictionaries.put(6,new Dictionary("apple","qua tao"));
    }

    public List<Dictionary> findAll(){
        return new ArrayList<>(dictionaries.values());
    }

}
