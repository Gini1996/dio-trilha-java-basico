/*
 * Princípios da Orientacao a Objeto: 
 * Encapsulamento:
 *   O encapsulamento se refere ao ato de esconder métodos da classe, tornando-os privados como no exemplo abaixo.
 *   A ocultação dos métodos (private) restringe seu uso em demais classes que utilizarão esta classe
 *   Desta forma somente métodos-chaves (public) podem ser acessados externamente.
 * 
 * Herança:
 *   A Herança em POO refere-se ao ato de extender algo de alguma outra classe, normalmente chamada de classe pai (No exemplo: ServicoMensagemInstantanea.)
 *   Através do metodo EXTENDS na declaração da classe conseguimos herdar TODOS OS METODOS da classe que será referenciada.
 *   Com o metodo implementado, esta classe Messenger, agora possui os metodos da ServicoMensagemInstantanea
 *   Agora o restante da classe pode realizar personalizações para o Messenger, assim como as demais classes que extendem o ServicoMensagemInstantanea.
 *   
 * Herança Abstrata:
 *   Quando extendemos uma classe abstrata, obrigatóriamente devemos implementar todos os metodos contidos dentro daquela classe e devemos desenvolver os mesmos como no exemplo.
 **/

package apps;

public class Messenger extends ServicoMensagemInstantanea
{

	@Override
	public void enviarMensagem() 
	{
	   validarConexao();
	   System.out.println("Enviando mensagem pelo Messenger");		
	}

	@Override
	public void receberMensagem() 
	{
		System.out.println("Recebendo mensagem pelo Messenger");					
	}
	
}
