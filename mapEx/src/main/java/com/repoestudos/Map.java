/*
 * Collections:
 * 	Map trabalha com pares de Chave, Valor
 *  Sempre com chaves unicas
 *  HashMap nao mantem ordenação dos elementos adicionados
 *  Put e usado tambem para substituicao, ele verifica se a chave ja existe e altera apenas o valor.
 *  Map consegue utilizar os metodos Entry.
 *  */

package com.repoestudos;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map
{
	public static void main(String[] args) 
	{
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
		HashMap<String,Double> carrosPopulares = new HashMap<>();
		carrosPopulares.put("gol", 14.4);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);
		System.out.println(carrosPopulares);
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo Tucson esta no dicionario: " + carrosPopulares.containsKey("Tucson"));
		
		System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("uno"));
		
		System.out.println("Exiba os modelos");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos");
		Collection<Double> values = carrosPopulares.values();
		System.out.println(values);
		
		System.out.println("Exiba o modelo mais economico e seu consumo");
		Double max = Collections.max(carrosPopulares.values());
		Set<Entry<String,Double>> entries = carrosPopulares.entrySet();
		String modelo = "";
		for(Entry<String,Double> entry : entries)
		{
			if(entry.getValue().equals(max))
			{
				modelo = entry.getKey();
				System.out.println("Modelo: " + modelo);
				System.out.println("Consumo: " + max);
			}
		}
		
		System.out.println("Exiba o modelo menos economico e seu consumo");
		Double min = Collections.min(carrosPopulares.values());
		Set<Entry<String,Double>> entries2 = carrosPopulares.entrySet();
		String modeloMenos = "";
		for(Entry<String,Double> entry : entries2)
		{
			if(entry.getValue().equals(min))
			{
				modeloMenos = entry.getKey();
				System.out.println("Modelo: " + modeloMenos);
				System.out.println("Consumo: " + min);
			}
		}
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		
		while(iterator.hasNext())
		{
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma dos consumos: " + soma);
		System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));
		
		System.out.println("Remova os modelos com consumo igual a 15,6 km/l");
		Iterator<Double> iteratorRemove = carrosPopulares.values().iterator();
		while(iteratorRemove.hasNext())
		{
			Double next = iteratorRemove.next();
			if(next == 15.6)
			{
				iteratorRemove.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.println("Exiba na ordem em que foram informados");
		LinkedHashMap<String,Double> carrosPopulares2 = new LinkedHashMap<>();
		
		carrosPopulares2.put("gol", 14.4);
		carrosPopulares2.put("uno", 15.6);
		carrosPopulares2.put("mobi", 16.1);
		carrosPopulares2.put("hb20", 14.5);
		carrosPopulares2.put("kwid", 15.6);
		System.out.println(carrosPopulares2);
		
		System.out.println("Exiba todas os carros na ordem crescente");
		TreeMap<String,Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares3);
		
		System.out.println("Apagar todo o dicionario: ");
		carrosPopulares.clear();
		System.out.println(carrosPopulares);
		
		System.out.println("Conferindo se o dicionario esta vazio: " + carrosPopulares.isEmpty());
		
		
		
		System.out.println("Ordem Aleatoria");
		HashMap<String,Livro> meusLivros = new HashMap<>();
		meusLivros.put("Hawking, Stephen",new Livro("Uma Breve Historia do Tempo",256));
		meusLivros.put("Duhigg, Charles",new Livro("O Poder do Hábito",488));
		meusLivros.put("Harari, Yuval Noah",new Livro("21 lições para o seculo 21",432));
		for(Entry<String,Livro> livro : meusLivros.entrySet()) 
			System.out.println(livro.getKey() + " - " + livro.getValue());
		
		System.out.println("\nOrdem Insercao");
		LinkedHashMap<String,Livro> meusLivros2 = new LinkedHashMap<>();
		meusLivros2.put("Hawking, Stephen",new Livro("Uma Breve Historia do Tempo",256));
		meusLivros2.put("Duhigg, Charles",new Livro("O Poder do Hábito",488));
		meusLivros2.put("Harari, Yuval Noah",new Livro("21 lições para o seculo 21",432));
		for(Entry<String,Livro> livro : meusLivros2.entrySet()) 
			System.out.println(livro.getKey() + " - " + livro.getValue());
		
		System.out.println("\nOrdem Alfabetica (Autores)");
		TreeMap<String,Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		System.out.println(meusLivros3);
		
		System.out.println("\nOrdem Alfabetica (Livros)");
		Set<Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorLivros());
		meusLivros4.addAll(meusLivros3.entrySet());
		System.out.println(meusLivros4);
	}
}
