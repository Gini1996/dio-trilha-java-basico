/*
 * Princípios da Orientacao a Objeto: 
 * Polimorfismo:
 *   Polimorfismo é a utilização de uma mesma classe para obter particularidades
 *   No exemplo, instanciamos a classe abstrata ServicoMensagemInstantanea
 *   A partir do que for passado na variável appEscolhido será atribuida a particularidade de uma das classes que extenderam o ServicoMensagemInstantanea. 
 *   */

package com.repoestudos.msg;

import apps.Messenger;
import apps.MessengerAlternativo;
import apps.ServicoMensagemInstantanea;

public class PC 
{
	public static void main(String[] args) 
	{
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msnAlt";
		
		if( appEscolhido.equals( "msn" ) )
		{
			smi = new Messenger();
		}
		else if( appEscolhido.equals( "msnAlt" ) )
		{
			smi = new MessengerAlternativo();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}