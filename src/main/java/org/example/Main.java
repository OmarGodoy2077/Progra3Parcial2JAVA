package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobles = new ArrayList<>();

        numeros.stream()
                .forEach(numero -> numerosDobles.add(numero * 2));

// Imprimimos los números dobles
        for (int numero : numerosDobles) {
            System.out.println(numero);
        }

        // Definimos el array de números
        int[] segundo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// Filtramos los números pares
        int[] numerosPares = Arrays.stream(segundo)
                .filter(numero -> (segundo % 2) == 0)
                .toArray();

// Imprimimos los números pares
        for (int numero : numerosPares) {
            System.out.println(numero);
        }

        // Definimos el array de números
        int[] se = {1, 2, 3, 4, 5};

// Multiplicamos cada número por 2
        int[] numerosDobles3 = Arrays.stream(se)
                .map(numero -> numero * 2)
                .toArray();

// Imprimimos los números dobles
        for (int numero : numerosDobles) {
            System.out.println(numero);
        }

// Definimos la lista de listas de números
        List<List<Integer>> numeros4 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

// Aplanamos la lista de listas de números
        Stream<Integer> todosLosNumeros = numeros4.stream()
                .flatMap(lista -> lista.stream());

// Imprimimos todos los números
        todosLosNumeros.forEach(System.out::println);

    }



}
