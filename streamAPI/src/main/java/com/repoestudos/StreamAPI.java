package com.repoestudos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamAPI
{
	public static void main(String[] args) 
	{
		System.out.println("--\tOrdem Aleatoria\t--");
		HashMap<Integer,Contato> agenda = new HashMap<>();
		agenda.put(1,new Contato("Simba",5555));
		agenda.put(2,new Contato("Cami",1111));
		agenda.put(3,new Contato("Jon",2222));
		
		System.out.println(agenda);
		
		for(HashMap.Entry<Integer, Contato> entry: agenda.entrySet()) 
		{
	        System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	    }

	    System.out.println("--\tOrdem Inserção\t--");
	    LinkedHashMap<Integer, Contato> agenda1 = new LinkedHashMap<>();
	    agenda1.put(1, new Contato("Simba", 5555));
	    agenda1.put(4, new Contato("Cami", 1111));
	    agenda1.put(3, new Contato("Jon", 2222));
	    System.out.println(agenda1);
	    
	    for (HashMap.Entry<Integer, Contato> entry: agenda1.entrySet()) 
	    {
	       System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	    }

	    System.out.println("--\tOrdem id\t--");
	    TreeMap<Integer, Contato> agenda2 = new TreeMap<>(agenda);
	    System.out.println(agenda2);
	    
	    for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) 
	    {
	        System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	    }

	    System.out.println("--\tOrdem número telefone\t--"); 
	    Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
	    set.addAll(agenda.entrySet());
	    for (Map.Entry<Integer, Contato> entry: set) 
	    {
	    	System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
	    }

	    System.out.println("--\tOrdem nome contato\t--");
	    Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
	    set1.addAll(agenda.entrySet());
	        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
	        
	    System.out.println("----------- EXERCICIOS -----------");
	    List<String> numerosAleatorios = new ArrayList<>();
	    numerosAleatorios.add("1");
	    numerosAleatorios.add("0");
	    numerosAleatorios.add("4");
	    numerosAleatorios.add("1");
	    numerosAleatorios.add("2");
	    numerosAleatorios.add("3");
	    numerosAleatorios.add("9");
	    numerosAleatorios.add("9");
	    numerosAleatorios.add("6");
	    numerosAleatorios.add("5");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        														  .map(Integer::parseInt)
        														  .collect(Collectors.toList());

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                				.skip(3)
                				.forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
											              .distinct()
											              .count();
        
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
				                .mapToInt(Integer::intValue)
				                .min()
				                .ifPresent(System.out::println);
				
        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
				                .mapToInt(Integer::intValue)
				                .max()
				                .ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
											              .filter(i -> (i % 2 == 0))
											              .mapToInt(Integer::intValue)
											              .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
													                .sorted(Comparator.naturalOrder())
													                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                																		   .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
        
	}
}