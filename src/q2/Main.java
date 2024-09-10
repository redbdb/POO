package q2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int quantquestoes;
		char resposta;
		int valorquestao;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do aluno");
		nome = scanner.next();
		System.out.println("Digite a quantiade de questoes");
		quantquestoes = scanner.nextInt();
		Prova prova1 = new Prova(nome, quantquestoes);
		while(true) {
			int total = 0;
			for(int i = 0; i < prova1.GetNquest(); i++) {
				System.out.println("Digite o valor da questao " + (i + 1));
				valorquestao = scanner.nextInt();
				prova1.SetValorq(valorquestao ,i);
				total += prova1.GetValorq(i);
				System.out.println("Digite a resposta da questao(A até E)");
				resposta = scanner.next().charAt(0);
				prova1.SetRespostas(resposta, i);
			}
			if(total == 10)
				break;
			System.out.println("Valor das questões invalido, deve somar 10");
		}
		
		System.out.println("Digite o nome do aluno");
		nome = scanner.next();
		System.out.println("Digite a quantiade de questoes");
		quantquestoes = scanner.nextInt();
		Prova prova2 = new Prova(nome, quantquestoes);
		while(true) {
			int total = 0;
			for(int i = 0; i < prova2.GetNquest(); i++) {
				System.out.println("Digite o valor da questao " + (i + 1));
				valorquestao = scanner.nextInt();
				prova2.SetValorq(valorquestao ,i);
				total += prova2.GetValorq(i);
				System.out.println("Digite a resposta da questao(A até E)");
				resposta = scanner.next().charAt(0);
				prova2.SetRespostas(resposta, i);
			}
			if(total == 10)
				break;
			System.out.println("Valor das questões invalido, deve somar 10");
		}
		
		System.out.println("Digite a quantiade de questoes do gabarito");
		quantquestoes = scanner.nextInt();
		Gabarito gabarito = new Gabarito(quantquestoes);
		if(prova1.GetNquest() != gabarito.GetNquest() || prova2.GetNquest() != gabarito.GetNquest()) {
			System.out.println("Quantidade de questoes do gabarito e prova incompativeis");
			return;
		}
		for(int i = 0; i < gabarito.GetNquest(); i++) {
			System.out.println("Digite a resposta da questao");
			resposta = scanner.next().charAt(0);
			gabarito.SetRespostas(resposta, i);
		}
		
		Corretor corrigir = new Corretor();
		corrigir.CorrigirProva(gabarito, prova1);
		corrigir.CorrigirProva(gabarito, prova2);
		
	}

}
