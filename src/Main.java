import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Desenvolvimento basico em Java");
		curso1.setDescricao("Aprenda desde os conceitos e instalacao ate a execucao de projetos em Java");
		curso1.setCargaHoraria(6);

		Curso curso2 = new Curso();
		curso2.setTitulo("Introducao programacao com Python");
		curso2.setDescricao(
				"O curso traz todo o embasamento da linguagem Python, quando e onde sao mais indicado aplic�-la.");
		curso2.setCargaHoraria(8);

		Curso curso3 = new Curso();
		curso3.setTitulo("Criando aplicacoes web com Spring Web MVC");
		curso3.setDescricao(
				"O Spring Web MVC reune varias funcoes em apenas uma ferramenta que otimiza o trabalho do desenvolvedor.");
		curso3.setCargaHoraria(7);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("O time de Education da DIO falar sobre essa linguagem que e muito usada no mercado");
		mentoria1.setCargaHoraria(2);
		mentoria1.setData(LocalDate.now());

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setId(14);
		dev1.setNome("Beatriz");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println("Conteudos Inscritos Beatriz:" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Concluidos Beatriz:" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXP());

		bootcamp1.gerarCertificado(dev1);

		Dev dev2 = new Dev(7, "Tadeu");
		bootcamp1.gerarCertificado(dev2);

	}

}
