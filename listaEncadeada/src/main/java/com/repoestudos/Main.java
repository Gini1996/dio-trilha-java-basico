package com.repoestudos;

public class Main 
{
	public static void main(String[] args) 
	{
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		minhaListaEncadeada.add("Um");
		minhaListaEncadeada.add("Dois");
		minhaListaEncadeada.add("Tres");
		minhaListaEncadeada.add("Quatro");
		
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println(minhaListaEncadeada);
		
		System.out.println(minhaListaEncadeada.remove(3));
		
		System.out.println(minhaListaEncadeada);
	}
}