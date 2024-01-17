package com.desafioiphone.apps.navegador;

import java.util.Scanner;

public class Navegador extends ServicoNavegador
{
	Scanner sc = new Scanner(System.in);
	
	public void AcessarNavegador()
	{
		System.out.println("\nEscolha o que deseja fazer: \n");
		System.out.println("1 - Exibir Pagina");
		System.out.println("2 - Adicionar Nova Aba");
		System.out.println("3 - Atualizar Pagina");
		
		int escolha = sc.nextInt();
		
		if(escolha == 1)
		{
			exibirPagina();
		}
		else if(escolha == 2)
		{
			adicionarNovaAba();
		}
		else if(escolha == 3)
		{
			atualizarPagina();
		}	
	}

	@Override
	protected void exibirPagina() 
	{
		System.out.println("Exibindo a pagina www.facebook.com.br");
	}

	@Override
	protected void adicionarNovaAba() 
	{
		System.out.println("Nova Aba adicionada com sucesso");
	}

	@Override
	protected void atualizarPagina() 
	{
		System.out.println("Pagina Atualizada com sucesso");
	}
}
