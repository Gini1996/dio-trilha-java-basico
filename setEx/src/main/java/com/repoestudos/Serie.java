package com.repoestudos;

import java.util.Objects;

public class Serie implements Comparable<Serie>
{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) 
	{
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getGenero() 
	{
		return genero;
	}

	public void setGenero(String genero) 
	{
		this.genero = genero;
	}

	public Integer getTempoEpisodio() 
	{
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) 
	{
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() 
	{
		return "{Nome=" + nome + ", Genero=" + genero + ", TempoEpisodio=" + tempoEpisodio + "}";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(nome, genero, tempoEpisodio);
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
		Serie other = (Serie) obj;
		return Objects.equals(nome, other.nome) && 
				Objects.equals(genero, other.genero) && 
				 Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie s) 
	{
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
		if(tempoEpisodio != 0)
			return tempoEpisodio;
		
		return this.getGenero().compareTo(s.getGenero());
	}
		
}
