package ru.iFellow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repository {
    private static Map <Integer, Integer> results = new HashMap<Integer, Integer>();


    public static void setResults(int id, int result) {
        results.put(id, result);
    }

    public static Integer getResults(int id) {
        Integer res = results.get(id);
        return res;
    }

    public static Integer getKey(){
        ArrayList<Integer> list = new ArrayList<>(results.keySet());
        if (list.isEmpty()){
            return 0;
        }
        else {
            return list.size();
        }
    }
}
