/*
 * Estrutura de Dados:
 *   Generics:
 *   O Generics é uma parte da estrutura de dados onde podemos criar classes genericas passando atributos da seguinte forma:
 *   <T> ou <"Alguma das chaves proprias aqui">
 *   No exemplo abaixo, refatoramos a classe nó para que ela receba qualquer tipo de dado, ou seja, virou uma classe genérica adicionando o <T>.
 */

package com.projetono;

public class No<T> 
{
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) 
	{
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() 
	{
		return conteudo;
	}

	public void setConteudo(T conteudo) 
	{
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() 
	{
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) 
	{
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() 
	{
		return "No [conteudo=" + conteudo + "]";
	}
}
