/*
 * Collections:
 * 	HashSet não permite elementos duplicados e nao possui indice
 *  LinkedHashSet mantem a ordenacao de entrada dos dados
 *  TreeSet ordena os elementos inseridos de forma crescente, desde que a referencia do TreeSet tenha um Comparable
 * */

package com.repoestudos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set 
{
	public static void main(String[] args) 
	{
		HashSet<Double> notas = new HashSet<>();
		System.out.println("------------- METODOS HASHSET -------------");
		
		System.out.println("Crie um conjunto e adicione notas");
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));
		System.out.println("Exibir a menor nota: " + Collections.min(notas));
		System.out.println("Exibir a maior nota: " + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		
		while(iterator.hasNext())
		{
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma das notas: " + soma);
		System.out.println("Exiba a media das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0.0");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista");
		Iterator<Double> iteratorRemove = notas.iterator();
		while(iteratorRemove.hasNext())
		{
			Double next = iteratorRemove.next();
			if(next < 7.0)
			{
				iteratorRemove.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Exiba na ordem em que foram informados");
		LinkedHashSet<Double> notas2 = new LinkedHashSet<>();
		
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente");
		TreeSet<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apagar todo o conjunto: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Conferindo se o conjunto esta vazio: " + notas.isEmpty());
		System.out.println("------------- FIM METODOS HASHSET -------------");
		
		System.out.println("------------- ORDENACAO HASHSET -------------");
		System.out.println("Ordem Aleatoria");
		HashSet<Serie> minhaSerie = new HashSet<>();
		minhaSerie.add(new Serie("Two And A Half Men","Comedia",25));
		minhaSerie.add(new Serie("Cold Case","Drama",60));
		minhaSerie.add(new Serie("Got","Fantasia",60));
		for(Serie serie: minhaSerie) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("\nOrdem Insercao");
		LinkedHashSet<Serie> minhaSerie2 = new LinkedHashSet<>();
		minhaSerie2.add(new Serie("Two And A Half Men","Comedia",25));
		minhaSerie2.add(new Serie("Cold Case","Drama",60));
		minhaSerie2.add(new Serie("Got","Fantasia",60));
		for(Serie serie: minhaSerie2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("\nOrdem Natural (Tempo Episodio)");
		TreeSet<Serie> minhaSerie3 = new TreeSet<>(minhaSerie2);
		System.out.println(minhaSerie3);
		
		System.out.println("\nOrdem Nome/Tempo/Episodio");
		TreeSet<Serie> minhaSerie4 = new TreeSet<>(new ComparatorNomeGeneroEpisodio());
		minhaSerie4.addAll(minhaSerie3);
		System.out.println(minhaSerie4);
		System.out.println("------------- FIM ORDENACAO HASHSET -------------");
		
		
	}
}
