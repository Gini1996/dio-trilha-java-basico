/*
 * Estrutura de dados:
 *   Atribução de valores:
 *   Ao atribuir valores diretamente de uma variável a outra, o processo que ocorre é a transferencia "dura", direta dos valores entre uma 
 *   variável e outra.
 *   Agora quando essa atribuição é feita por objetos, ao modificar qualquer valor de um dos objetos ele reflete a alteração em todos
 *   Pois ele está buscando a referencia daquela classe/objeto. E por consequencia tras o dado atualizado*/

package com.projeto.atribuicaoreferencia;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("---Trabalhando com dados primitivos---");
		int a = 1;
		int b = a;
		System.out.println("A = " + a + "\nB = " + b);
		
		a = 2;
		System.out.println("A = " + a + "\nB = " + b);
		
		System.out.println("---Trabalhando com dados do objeto---");
		MeuObj objA = new MeuObj(1);
		MeuObj objB = objA;
		System.out.println("A = " + objA + "\nB = " + objB);
		
		objA.setNum(2);
		System.out.println("A = " + objA + "\nB = " + objB);
	}	
}