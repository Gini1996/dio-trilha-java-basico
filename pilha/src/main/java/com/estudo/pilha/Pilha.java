package com.estudo.pilha;

public class Pilha 
{
	private No refNoEntrada;

	public Pilha() 
	{
		this.refNoEntrada = null;
	}
	
	//Exclui o ultimo elemento adicionado
	public No pop()
	{
		if(this.isEmpty())
		{
			//Nó que será retirado
			No noPoped = refNoEntrada;
			//Recebe o proximo nó
			refNoEntrada = refNoEntrada.getRefNo();
			return noPoped;
		}
		
		return null;
	}
	
	//Acrescenta um nó ao topo
	public void push(No novoNo)
	{
		//Guarda o nó de entrada
		No refAuxiliar = refNoEntrada;
		
		//Assume que o valor passado virou o nó do topo
		refNoEntrada = novoNo;
		
		//Seta o novo nó como auxiliar para repetir o prodimento na nova execução.
		refNoEntrada.setRefNo(refAuxiliar);
	}
	
	// A função TOP tem o unico objetivo de retornar o Nó do Topo.
	public No top()
	{
		return refNoEntrada;
	}
	
	public boolean isEmpty()
	{
		return refNoEntrada == null ? true : false;
	}
	
	@Override
	public String toString()
	{
		String stringRetorno = "----------------\n";
		stringRetorno += "           Pilha\n";
		stringRetorno += "----------------\n";
		
		No noAuxiliar = refNoEntrada;
		
		while(true)
		{
			if(noAuxiliar != null)
			{
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}
			else
			{
				break;
			}
		}
		
		stringRetorno += "===============\n";
		
		return stringRetorno;		
	}
	
}
