package com.repoestudos;

import java.util.Comparator;
import java.util.Map.Entry;

public class ComparatorLivros implements Comparator<Entry<String,Livro>>
{
	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) 
	{
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
}
