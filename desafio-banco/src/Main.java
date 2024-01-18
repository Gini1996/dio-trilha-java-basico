
public class Main 
{
	public static void main(String[] args) 
	{
		Cliente leonardo = new Cliente();
		leonardo.setNome("Leonardo Ferreira");
		
		Conta cc = new ContaCorrente(leonardo);
		cc.depositar(150);
		
		Conta cp = new ContaPoupanca(leonardo);
		
		cc.transferir(cp, 5);
		
		cc.extrato();
		cp.extrato();
	}
}