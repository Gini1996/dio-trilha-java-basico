import lombok.Getter;

@Getter
public abstract class Conta implements IConta
{
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente)
	{
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	protected void imprimirInfosComuns() 
	{
		System.out.println(this.cliente.getNome());
		System.out.println(this.agencia);
		System.out.println(this.numero);
		System.out.println(this.saldo);
	}

	@Override
	public void sacar(double valor) 
	{
		if(valor > saldo)
		{
			System.out.println("Não e posivel sacar mais que o valor disponivel em conta");
		}
		else
			this.saldo = saldo - valor;
	}

	@Override
	public void depositar(double valor) 
	{
		if(valor <= 0)
		{
			System.out.println("Nao e possivel depositar valores nulos ou negativos para transferencia");
		}
		else
			this.saldo = saldo + valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) 
	{
		if(valor <= 0)
		{
			System.out.println("Nao e possivel sacar valores negativos para transferencia");
		}
		else
		{
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
	}
}
