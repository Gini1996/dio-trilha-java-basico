package br.com.desafio.bootcamp;

import java.time.LocalDate;

import br.com.desafio.bootcamp.dominio.Bootcamp;
import br.com.desafio.bootcamp.dominio.Curso;
import br.com.desafio.bootcamp.dominio.Dev;
import br.com.desafio.bootcamp.dominio.Mentoria;

public class Main 
{
	public static void main(String[] args) 
	{
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descricao Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer");
		bootcamp.setDescricao("Descricao Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLeonardo = new Dev();
		devLeonardo.setNome("Leonardo");
		devLeonardo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: Leonardo " + devLeonardo.getConteudosInscritos());		
		devLeonardo.progredir();
		devLeonardo.progredir();
		System.out.println("------------------------------------------");
		System.out.println("Conteudos inscritos: Leonardo " + devLeonardo.getConteudosInscritos());		
		System.out.println("Conteudos concluidos: Leonardo " + devLeonardo.getConteudosConcluidos());
		System.out.println("XP: " + devLeonardo.calcularTotalXp());
		System.out.println("------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: Joao " + devJoao.getConteudosInscritos());		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("------------------------------------------");
		System.out.println("Conteudos inscritos: Joao " + devJoao.getConteudosInscritos());		
		System.out.println("Conteudos concluidos: Joao " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}
}
