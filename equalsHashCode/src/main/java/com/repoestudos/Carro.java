/*
 * Estrutura de Dados:
 * 	Equals: Realizar uma comparação entre objetos
 *  HashCode: Retorna um valor inteiro/um hash gerado a partir do atributo.
 *  */

package com.repoestudos;

import java.util.Objects;

public class Carro
{
	String marca;
	
	public Carro(String marca)
	{
		this.marca = marca;
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}
}
