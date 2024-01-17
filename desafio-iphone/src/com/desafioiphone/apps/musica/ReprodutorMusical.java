package com.desafioiphone.apps.musica;

import java.util.Scanner;

public class ReprodutorMusical extends ServicoMusica
{
	Scanner sc = new Scanner(System.in);
	
	public void AcessarReprodutor()
	{
		System.out.println("\nEscolha o que deseja fazer: \n");
		System.out.println("1 - Tocar musica");
		System.out.println("2 - Pausar musica");
		System.out.println("3 - Selecionar nova musica");
		
		int escolha = sc.nextInt();
		
		if(escolha == 1)
		{
			tocar();
		}
		else if(escolha == 2)
		{
			pausar();
		}
		else if(escolha == 3)
		{
			selecionarMusica();
		}	
	}

	@Override
	protected void tocar() 
	{
		System.out.println("Tocando musica selecionada");
	}

	@Override
	protected void pausar() 
	{
		System.out.println("Musica pausada");
	}

	@Override
	protected void selecionarMusica() 
	{	
		System.out.println("\nSelecione uma musica: \n");
		System.out.println("1 - Dead Fish - Tango");
		System.out.println("2 - Emicida.feat Pitty - Hoje Cedo");
		System.out.println("3 - Djonga - Bença");
		
		int musica = sc.nextInt();
		
		if(musica == 1)
		{
			System.out.println("Musica selecionada: Dead Fish - Tango");
		}
		else if(musica == 2)
		{
			System.out.println("Musica selecionada: Emicida.feat Pitty - Hoje Cedo");
		}
		else if(musica == 3)
		{
			System.out.println("Musica selecionada: Djonga - Bença");
		}
	}
}
