package com.desafioiphone.apps.telefone;

import java.util.Scanner;

public class Telefone extends ServicoTelefone
{
	Scanner sc = new Scanner(System.in);
	
	public void AcessarTelefone()
	{
		System.out.println("\nEscolha o que deseja fazer: \n");
		System.out.println("1 - Ligar");
		System.out.println("2 - Atender");
		System.out.println("3 - Correio de Voz");
		
		int escolha = sc.nextInt();
		
		if(escolha == 1)
		{
			ligar();
		}
		else if(escolha == 2)
		{
			atender();
		}
		else if(escolha == 3)
		{
			iniciarCorreiodeVoz();
		}	
	}

	@Override
	protected void ligar() 
	{
		System.out.println("Ligando para.....");
	}

	@Override
	protected void atender() 
	{
		System.out.println("Atendendo.......");
	}

	@Override
	protected void iniciarCorreiodeVoz() 
	{
		System.out.println("Correio de Voz iniciado com sucesso");
	}
}
