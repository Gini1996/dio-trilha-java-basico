/*
 * Estrutura de Dados:
 * Map: Trabalha com cahve e valor
 * Put: Adiciona valores ao Map
 * keySet: Retorna as chaves do Map
 * values: Retorna o valor de cada uma das chaves 
 * containsKey: Retorna se aquele Map contem a chave informada
 * 
 * O map possibilita criar listas com ele
 * */

package com.repoestudos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main 
{
	public static void main(String[] args) 
	{
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3A");
		
		System.out.println(aluno);
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "8.9");
		aluno2.put("Turma", "3B");
		
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		System.out.println((aluno.containsKey("Nome")));
	}
}