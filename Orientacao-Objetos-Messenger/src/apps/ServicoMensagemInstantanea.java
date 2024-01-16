/*
 * Princípios da Orientacao a Objeto: 
 * Abstracao:
 *   Uma classe abstrata é definida pelo termo ABSTRACT 
 *   Note que a classe abstrata possui metodos abstratos e estes por regra não possuem um corpo e tem implementação obrigatoria quando extendido a outra classe.
 * 
 * Metodo Protected  
 *   Uma classe abstrata pode conter métodos do tipo PROTECTED
 *   Um metodo protected funciona de forma similar ao private, enquanto o private restringe o acesso a propria classe, o protected permite que o metodo implementado
 *   possa ser chamado dentro de todas as classes que estenderam esta(classes filhas) e dentro das classes do mesmo pacote.
 */

package apps;

public abstract class ServicoMensagemInstantanea 
{
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConexao()
	{
		System.out.println( "Validando Conexão do Usuario" );
	}
}