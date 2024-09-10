package exanima;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passaro ari = new Passaro();
		Peixe blob = new Peixe();
		Homem gu = new Homem();
		System.out.println("Peixe: ");
		blob.Mover();
		blob.Som();
		blob.GetTamanho();
		System.out.println("Ave: ");
		ari.Mover();
		ari.Som();
		ari.GetTamanho();
		System.out.println("Homem: ");
		gu.Mover();
		gu.Som();
		gu.GetTamanho();
	}

}
