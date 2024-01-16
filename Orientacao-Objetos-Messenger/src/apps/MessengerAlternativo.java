package apps;

public class MessengerAlternativo extends ServicoMensagemInstantanea
{

	@Override
	public void enviarMensagem() 
	{
	   validarConexao();
	   System.out.println("Enviando mensagem pelo Messenger Alternativo");		
	}

	@Override
	public void receberMensagem() 
	{
		System.out.println("Recebendo mensagem pelo Messenger Alternativo");					
	}

}
