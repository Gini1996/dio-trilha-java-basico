/*
 * Collections:
 * 	Collections possuem funções em que podemos utilizar nos principais metodos de Estrutura de Dados
 *  Iterator: recebe o conteudo da lista e através do hasNext() conseguimos percorrer a lista e realizar alguma ação
 *  Comparator: Para realizar a ordenação de listas é necessario implementar uma classe de Comparação, que implementa Comparator do Java Utils
 */

package com.repoestudos.listsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists 
{
	public static void main(String[] args) 
	{
		System.out.println("------------- METODOS LIST -------------");
		System.out.println("Crie uma lista e adicione 7 notas");
		
		List<Double> notas = new ArrayList<>();
		notas.add(9.5);
		notas.add(9.0);
		notas.add(5.0);
		notas.add(7.5);
		notas.add(2.5);
		notas.add(0.5);
		notas.add(4.5);
		System.out.println(notas);
		
		System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5.0));
		
		//Para adicionar elemento em ponto especifico podemos utilizar o add passando indice/valor
		System.out.println("Adicione na lista a nota 8.0 na posicao 4:");
		notas.add(4, 8.0);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set(2, 6.0);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5.0));
		
		System.out.println("Imprimir os elementos da forma que foram inseridos:");
		for(Double nota: notas)
			System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		
		while(iterator.hasNext())
		{
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma das notas: " + soma);
		System.out.println("Exiba a media das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0.5");
		notas.remove(0.5);
		System.out.println(notas);
		
		System.out.println("Remova a nota da posição 0");
		notas.remove(0);
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
		
		System.out.println("Apagar lista");
		notas.removeAll(notas);
		System.out.println(notas);
		
		System.out.println("Conferindo se a lista esta vazia: " + notas.isEmpty());
		
		System.out.println("------------- FIM METODOS LIST -------------");
		
		System.out.println("------------- ORDENACAO LIST -------------");
		List<Gato> meusGatos = new ArrayList<>();
		meusGatos.add(new Gato("Jon",18,"preto"));
		meusGatos.add(new Gato("Simba",6,"tigrado"));
		meusGatos.add(new Gato("Jon",12,"amarelo"));
		System.out.println(meusGatos);
		
		System.out.println("Ordem de Insercao");
		System.out.println(meusGatos);
		
		System.out.println("Ordem aleatoria");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem Natural (Nome)");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem Idade");
		Collections.sort(meusGatos, new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem Cor");
		Collections.sort(meusGatos, new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("Ordem Nome/Cor/Idade");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
	}		
}