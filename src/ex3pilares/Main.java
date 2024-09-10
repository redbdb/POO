package ex3pilares;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Aluno teste = new Aluno(5, 0 ,10);
		teste.SetNasc("18032005");
		teste.SetNome("gu");
		System.out.println(teste.Nasc + teste.Nome + (teste.Nota1 + teste.Nota2 + teste.Nota3)/3 );
		
		
	}

}
