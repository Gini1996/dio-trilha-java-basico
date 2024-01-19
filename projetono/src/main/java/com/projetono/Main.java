/*
 * Estrutura de Dados:
 *   Generics:
 *   Aqui ao instanciar a classe No, definimos que a classe génerica irá receber valores do tipo String.
 *   Agora caso seja passado algum valor diferente de Sting gerará erro em tempo de execução.
 */

package com.projetono;

public class Main 
{
	public static void main(String[] args) 
	{
		No<String> no1 = new No<>("Conteudo No 1");
		No<String>no2 = new No<>("Conteudo No 2");
		no1.setProximoNo(no2);
		
		No<String> no3 = new No<>("Conteudo No 3");
		no2.setProximoNo(no3);
		
		No<String> no4 = new No<>("Conteudo No 4");
		no3.setProximoNo(no4);
		
		// Sequencia = no1 -> no2 -> no3 -> no4 -> null
	    System.out.println("No1");
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());	
	}
}