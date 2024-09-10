package exanima;

public class Peixe extends Animal{

	public Peixe() {
		this.Tamanho = "Medio";
	}
	
	@Override
	public void Som() {
		System.out.println("blub blub");
	}
	
	@Override
		public void Mover() {
		System.out.println("nadando");
	}
}
