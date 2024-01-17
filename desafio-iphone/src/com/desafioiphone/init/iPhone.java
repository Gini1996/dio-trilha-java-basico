package com.desafioiphone.init;

import java.util.Scanner;
import com.desafioiphone.apps.musica.ReprodutorMusical;
import com.desafioiphone.apps.navegador.Navegador;
import com.desafioiphone.apps.telefone.Telefone;

public class iPhone 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o App que deseja acessar: \n");
		System.out.println("Musica - Digite M");
		System.out.println("Telefone - Digite T");
		System.out.println("Navegador - Digite N");
		
		String escolherApp = sc.nextLine();
		
		if(escolherApp.equalsIgnoreCase("M"))
		{
			ReprodutorMusical musica = new ReprodutorMusical();
			musica.AcessarReprodutor();
		}
		else if(escolherApp.equalsIgnoreCase("T"))
		{
			Telefone telefone = new Telefone();
			telefone.AcessarTelefone();
		}
		else if( escolherApp.equalsIgnoreCase("N"))
		{
			Navegador navegador = new Navegador();
			navegador.AcessarNavegador();
		}
		else 
			System.out.println("Opcao Invalida");
	}
}
