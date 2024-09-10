package pratica;
import java.util.*;

public class Partida {

	public static void main(String[] args) {
		int Min;
		int Max;
		int Chute;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o valor mínimo do intervalo?");
		Min = scanner.nextInt();
		System.out.println("Qual o valor máximo do intervalo?");
		Max = scanner.nextInt();
		Apertadinho jogo = new Apertadinho(Min, Max);
		while(true) {
			System.out.println("Digite o seu chute:");
			Chute = scanner.nextInt();
			if(jogo.Verificar(Chute)) {
				System.out.println("Você acertou!");
				break;
			} else {
				if(Chute > jogo.GetNum()) {
					jogo.SetMax(Chute);
					System.out.println("O chute foi maior do que o número, o intervalo é " + jogo.GetMin() + " até " + jogo.GetMax());
				} else {
					jogo.SetMin(Chute);
					System.out.println("O chute foi maior do que o número, o intervalo é " + jogo.GetMin() + " até " + jogo.GetMax());
				}
			}
		}
	}

}
