package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2); // Combina las dos listas
        return result;
    }


}
