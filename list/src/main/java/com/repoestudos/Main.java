/*
 * Estrutura de Dados:
 * 	Contains: Verifica se contém o elemento na lista
 *  Get: Busca um elemento da lista pelo Indice
 *  indexOf: Retorna o indice do elemento que buscou na lista
 *  remove: Retira da lista o elemento passando seu indice
 */

package com.repoestudos;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Carro> listCarro = new ArrayList<>();
		
		listCarro.add(new Carro("Ford"));
		listCarro.add(new Carro("Chevrolet"));
		listCarro.add(new Carro("Fiat"));
		listCarro.add(new Carro("Pegeot"));
		
		System.out.println(listCarro);
		System.out.println(listCarro.contains(new Carro("Ford")));
		
		System.out.println(listCarro.get(2));
		
		System.out.println(listCarro.indexOf(new Carro("Fiat")));
		System.out.println(listCarro.indexOf(new Carro("Fiat2024")));
		
		System.out.println(listCarro.remove(2));
		System.out.println(listCarro);
	}
}
