package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Metodo para convertir de cadena a entero
    private static List<Integer> ConvertirLista(String input) {
        String[] numerosComoTexto = input.split(","); // Separar por comas
        List<Integer> lista = new ArrayList<>();
        for (String numero : numerosComoTexto) {
            lista.add(Integer.parseInt(numero.trim())); // Convierte cada número a entero y lo mete a la lista
        }
        return lista;
    }
    //Metodo para combinar las listas
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2); // Combina las dos listas
        return result;
    }

    //Metodo para ordenar la lista con el algoritmo de burbuja
    public static void Burbuja(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }




}
