package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso JavaColecoes = new Curso("Dominando as cole��es do Java", "Paulo");

		//JavaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		JavaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		JavaColecoes.adiciona(new Aula("Criando uma aula", 20));
		JavaColecoes.adiciona(new Aula("Modelando em cole��es", 22));
		
		
		List<Aula> aulas = JavaColecoes.getAulas();
		
		System.out.println(JavaColecoes.getAulas());
		
		
	}
}
