/*
 * Estrutura de Dados:
 * 	Push: Adiciona ao topo da fila 
 *  Pop: Retira um elemento do topo da lista
 *  Peek: Demonstra o primeiro elemento da pilha, sem excluir
 *  Empty: Testa se a pilha está vazia.
 */

package com.repoestudo;

import java.util.Stack;

public class Main 
{
	public static void main(String[] args) 
	{
		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.empty());
	}
}