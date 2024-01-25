/*
 * Estrutura de Dados:
 * 	Offer: Adiciona como o metodo Add, mas nao apresenta erro, em caso negativo retorna False.
 *  Peek: Demonstra o primeiro elemento da fila
 *  Pool: Demonstra o primeiro elemento da fila e exclui em seguida.
 *  isEmpty: Demonstra se a fila esta vazia
 *  Size: Demonstra o tamanho da fila
 */

package com.repoestudos;

import java.util.LinkedList;
import java.util.Queue;

public class Main 
{
	public static void main(String[] args) 
	{
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		
		System.out.println(queueCarros.add(new Carro("Peugeout")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault")));	
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());	
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());	
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());	
		System.out.println(queueCarros.size());
			
	}
}