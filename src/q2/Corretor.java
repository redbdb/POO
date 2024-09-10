package q2;

public class Corretor {
	
	public void CorrigirProva(Gabarito gabarito, Prova prova) {
		if(gabarito.GetNquest() != prova.GetNquest()) {
			System.out.println("Prova e gabarito não são compatíveis.");
		} else {
			int notatotal = 0;
			for(int i = 0; i < prova.GetNquest(); i++) {
				if(prova.GetRespostas(i) == gabarito.GetRespostas(i)){
				notatotal += prova.GetValorq(i);
				}
			System.out.println("Aluno: " + prova.GetNome() + " Nota: " + notatotal);
			}
		}
	}
}
