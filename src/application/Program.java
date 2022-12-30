package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de pessoas? ");
		int N = sc.nextInt();
		Pessoa[] vect = new Pessoa[N];
		int aprovados = 0;
		double mediaAnterior = 0.0;
		String maiorMedia = null;
		double somaMediaAprovados = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite os dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Nota etapa 1: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota etapa 2: ");
			double nota2 = sc.nextDouble();
			vect[i] = new Pessoa(nome, nota1, nota2);
		}
		
		System.out.println();
		System.out.println("TABELA:");
		for (int i=0; i<vect.length; i++) {
			double media = (vect[i].getPrimeiraNota() + vect[i].getSegundaNota()) / 2;
			System.out.println(vect[i].getNome() 
					+ ", " 
					+ vect[i].getPrimeiraNota() 
					+ ", " + vect[i].getSegundaNota() 
					+ ", MEDIA = " 
					+ String.format("%.2f", media));
			
			if (media > mediaAnterior) {
				mediaAnterior = media;
				maiorMedia = vect[i].getNome();
			}
		}
		
		System.out.println();
		System.out.println("PESSOAS APROVADAS:");
		for (int i=0; i<vect.length; i++) {
			double media = (vect[i].getPrimeiraNota() + vect[i].getSegundaNota()) / 2;
			if (media >= 70.0) {
				aprovados += 1;
				somaMediaAprovados += media;
				System.out.println(vect[i].getNome());
			}
		}
		
		double porcentagemAprov = (aprovados * 100.0) / N;
		double mediaAprovados = somaMediaAprovados / aprovados;
		System.out.println();
		System.out.println("Porcentagem de aprovação: " + porcentagemAprov + " %");
		System.out.println("Maior média: " + maiorMedia);
		if (aprovados > 0) {
			System.out.println("Nota média dos aprovados: " + String.format("%.2f", mediaAprovados));
		}else {
			System.out.println("Não há candidatos aprovados");
		}
		sc.close();
	}

}
